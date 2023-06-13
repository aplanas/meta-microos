SUMMARY = "Guess media type for a file or a URL"
DESCRIPTION = "This module provides functions for handling media (also known as MIME) \
types and encodings. The mapping from file extensions to media types is \
defined by the _media.types_ file. If the _~/.media.types_ file exists it \
is used instead. For backwards compatibility we will also look for \
_~/.mime.types_. \
 \
The following functions are exported by default: \
 \
* guess_media_type( $filename ) \
 \
* guess_media_type( $uri ) \
 \
* guess_media_type( $filename_or_object, $header_to_modify ) \
 \
This function tries to guess media type and encoding for a file or objects \
that support the a 'path' or 'filename' method, eg, URI or File::Temp \
objects. When an object does not support either method, it will be \
stringified to determine the filename. It returns the content type, which \
is a string like ''text/html''. In array context it also returns any \
content encodings applied (in the order used to encode the file). You can \
pass a URI object reference, instead of the file name. \
 \
If the type can not be deduced from looking at the file name, then \
guess_media_type() will let the '-T' Perl operator take a look. If this \
works (and '-T' returns a TRUE value) then we return _text/plain_ as the \
type, otherwise we return _application/octet-stream_ as the type. \
 \
The optional second argument should be a reference to a HTTP::Headers \
object or any object that implements the $obj->header method in a similar \
way. When it is present the values of the 'Content-Type' and \
'Content-Encoding' will be set for this header. \
 \
* media_suffix( $type, ... ) \
 \
This function will return all suffixes that can be used to denote the \
specified media type(s). Wildcard types can be used. In a scalar context it \
will return the first suffix found. Examples: \
 \
  @suffixes = media_suffix('image/*', 'audio/basic'); \
  $suffix = media_suffix('text/html'); \
 \
The following functions are only exported by explicit request: \
 \
* add_type( $type, @exts ) \
 \
Associate a list of file extensions with the given media type. Example: \
 \
    add_type('x-world/x-vrml' => qw(wrl vrml)); \
 \
* add_encoding( $type, @ext ) \
 \
Associate a list of file extensions with an encoding type. Example: \
 \
 add_encoding('x-gzip' => 'gz'); \
 \
* read_media_types( @files ) \
 \
Parse media types files and add the type mappings found there. Example: \
 \
    read_media_types('conf/mime.types');"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.04"

RPM_NAME = "perl-LWP-MediaTypes-6.04-1.15.noarch.rpm"
RPM_HASH = "57d99aff20fcfae228360002b432c702d75adb9e0ab65b2fdf6d707013c4e0639b0e820f314dcc8bd568610c5f70c176526a100167091b4c0858a4d860a6666d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(LWP::MediaTypes) \
perl-LWP-MediaTypes"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

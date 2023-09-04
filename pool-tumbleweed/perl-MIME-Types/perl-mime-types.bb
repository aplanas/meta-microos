SUMMARY = "Definition of MIME types"
DESCRIPTION = "MIME types are used in many applications (for instance as part of e-mail \
and HTTP traffic) to indicate the type of content which is transmitted. or \
expected. See RFC2045 at _https://www.ietf.org/rfc/rfc2045.txt_ \
 \
Sometimes detailed knowledge about a mime-type is need, however this module \
only knows about the file-name extensions which relate to some filetype. It \
can also be used to produce the right format: types which are not \
registered at IANA need to use 'x-' prefixes. \
 \
This object administers a huge list of known mime-types, combined from \
various sources. For instance, it contains *all IANA* types and the \
knowledge of Apache. Probably the most complete table on the net!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.24"

RPM_NAME = "perl-MIME-Types-2.24-1.4.noarch.rpm"
RPM_HASH = "f12a2dd9ed90cd260840af3a09c8a70457814edb3b33bd1cf609ef425563aa5df9ed177fc3ad311ab230c0ddfaefa455472881b0444646376e0372dd141b225b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MIME--Type \
perl-MIME--Types \
perl-MIME-Types \
perl-MojoX--MIME--Types"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

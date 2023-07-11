SUMMARY = "Open an HTML file with automatic charset detection"
DESCRIPTION = "IO::HTML provides an easy way to open a file containing HTML while \
automatically determining its encoding. It uses the HTML5 encoding sniffing \
algorithm specified in section 8.2.2.2 of the draft standard. \
 \
The algorithm as implemented here is: \
 \
* 1. \
 \
If the file begins with a byte order mark indicating UTF-16LE, UTF-16BE, or \
UTF-8, then that is the encoding. \
 \
* 2. \
 \
If the first '$bytes_to_check' bytes of the file contain a '<meta>' tag \
that indicates the charset, and Encode recognizes the specified charset \
name, then that is the encoding. (This portion of the algorithm is \
implemented by 'find_charset_in'.) \
 \
The '<meta>' tag can be in one of two formats: \
 \
  <meta charset='...'> \
  <meta http-equiv='Content-Type' content='...charset=...'> \
 \
The search is case-insensitive, and the order of attributes within the tag \
is irrelevant. Any additional attributes of the tag are ignored. The first \
matching tag with a recognized encoding ends the search. \
 \
* 3. \
 \
If the first '$bytes_to_check' bytes of the file are valid UTF-8 (with at \
least 1 non-ASCII character), then the encoding is UTF-8. \
 \
* 4. \
 \
If all else fails, use the default character encoding. The HTML5 standard \
suggests the default encoding should be locale dependent, but currently it \
is always 'cp1252' unless you set '$IO::HTML::default_encoding' to a \
different value. Note: 'sniff_encoding' does not apply this step; only \
'html_file' does that."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.004"

RPM_NAME = "perl-IO-HTML-1.004-1.13.noarch.rpm"
RPM_HASH = "b0f02a2dbd7c36d1ca17a71d8bce7c5ab00caaf7dc827d1ef52c2b4f0a9751ea409e82eb46165f2ba2b10e7b80b973d2689b1428205a34cacd99c5cd555a3ce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--HTML \
perl-IO-HTML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

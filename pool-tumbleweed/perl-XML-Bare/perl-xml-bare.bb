SUMMARY = "Minimal XML parser implemented via a C state engine"
DESCRIPTION = "This module is a 'Bare' XML parser. It is implemented in C. The parser \
itself is a simple state engine that is less than 500 lines of C. The \
parser builds a C struct tree from input text. That C struct tree is \
converted to a Perl hash by a Perl function that makes basic calls back to \
the C to go through the nodes sequentially. \
 \
The parser itself will only cease parsing if it encounters tags that are \
not closed properly. All other inputs will parse, even invalid inputs. To \
allowing checking for validity, a schema checker is included in the module \
as well. \
 \
The schema format is custom and is meant to be as simple as possible. It is \
based loosely around the way multiplicity is handled in Perl regular \
expressions."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.53"

RPM_NAME = "perl-XML-Bare-0.53-5.39.aarch64.rpm"
RPM_HASH = "8eadf467566872bfa400ca23f8db8ae3f9a2864c0261a02fa201edd3f68a085fcee8b2bb8fe107c865f07a1e9b09229626ca575193fbd00c087967998e904db2"

RPROVIDES:${PN} += "perl-XML--Bare \
perl-XML--Bare--Object \
perl-XML-Bare"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm

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

RPM_NAME = "perl-XML-Bare-0.53-5.38.aarch64.rpm"
RPM_HASH = "b90eaa93fda936d88f80d4dc7dde7099511126abf6b4ce8b862ae1ab40ea60c80b408114600f9fdc39c0821331f7f447d2fbf15bbb2c2e1e15fa4bb8cb692104"

RPROVIDES:${PN} += "perl-XML--Bare \
perl-XML--Bare--Object \
perl-XML-Bare"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm

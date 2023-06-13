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

RPM_NAME = "perl-XML-Bare-0.53-5.37.aarch64.rpm"
RPM_HASH = "99f4bd998abed4ccae6bc9b8cea2b07bb7e13bdc62ec09a065dcb46646dcd46ad6c6c1de8513ab1dae302e469686591f07e250cc6dac49eb5e2a90a727213a6a"

RPROVIDES:${PN} += "perl(XML::Bare) \
perl(XML::Bare::Object) \
perl-XML-Bare \
perl-XML-Bare(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

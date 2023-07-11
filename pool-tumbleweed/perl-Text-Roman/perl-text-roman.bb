SUMMARY = "Allows conversion between Roman and Arabic algarisms."
DESCRIPTION = "This package supports both conventional Roman algarisms (which range from \
_1_ to _3999_) and Milhar Romans, a variation which uses a bar across the \
algarism to indicate multiplication by _1_000_. For the purposes of this \
module, acceptable syntax consists of an underscore suffixed to the \
algarism e.g. IV_V = _4_005_. The term Milhar apparently derives from the \
Portuguese word for 'thousands' and the range of this notation extends the \
range of Roman numbers to _3999 * 1000 + 3999 = 4_002_999_. \
 \
Note: the functions in this package treat Roman algarisms in a \
case-insensitive manner such that 'VI' == 'vI' == 'Vi' == 'vi'. \
 \
The following functions may be imported into the caller package by name:"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "3.5"

RPM_NAME = "perl-Text-Roman-3.5-1.25.noarch.rpm"
RPM_HASH = "73a02b634b29d2e2ca359e8cd0e2df6b771dc692c5c0bae01243ae812e9553412baac8ccb50af6371632ea0ef8c25bfa6b2d4d2b342b8ebb00330d5550ee3482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Roman \
perl-Text-Roman"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm

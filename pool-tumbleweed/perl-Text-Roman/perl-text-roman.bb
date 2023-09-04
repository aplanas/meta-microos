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

RPM_NAME = "perl-Text-Roman-3.5-1.26.noarch.rpm"
RPM_HASH = "5fdf032ea348651c7c0ce78f9b61ac15af0acb1edf32d9f3fc8c3baad664710cc656f3fa00c6166a34dbe25a143ee0e6a3be521053096cf1144df31a9de46cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Roman \
perl-Text-Roman"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

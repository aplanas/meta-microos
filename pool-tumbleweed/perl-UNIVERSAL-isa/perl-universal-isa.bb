SUMMARY = "Attempt to recover from people calling UNIVERSAL::isa as a function"
DESCRIPTION = "Whenever you use UNIVERSAL/isa as a function, a kitten using \
Test::MockObject dies. Normally, the kittens would be helpless, but if they \
use UNIVERSAL::isa (the module whose docs you are reading), the kittens can \
live long and prosper. \
 \
This module replaces 'UNIVERSAL::isa' with a version that makes sure that, \
when called as a function on objects which override 'isa', 'isa' will call \
the appropriate method on those objects \
 \
In all other cases, the real 'UNIVERSAL::isa' gets called directly. \
 \
*NOTE:* You should use this module only for debugging purposes. It does not \
belong as a dependency in running code."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.20171012"

RPM_NAME = "perl-UNIVERSAL-isa-1.20171012-1.20.noarch.rpm"
RPM_HASH = "37f800e1e4607c5d7d3f1d7134e55a694d79cffb0445af1347132553bf7a224e7a9605ec695588813fab8a60e319e3a2fc8d11f6ef4f1b0df1e771568dc70b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(UNIVERSAL::isa) \
perl-UNIVERSAL-isa"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

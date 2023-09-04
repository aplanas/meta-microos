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

RPM_NAME = "perl-UNIVERSAL-isa-1.20171012-1.22.noarch.rpm"
RPM_HASH = "5582d491abbb3bcec2bdc2416900f5122c2af943150233bd13a6801394a6e8ab2a22718294a4da3d9e8202ef1c5e6f4bcf5d6867ebb330a1a9afb876b0250644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-UNIVERSAL--isa \
perl-UNIVERSAL-isa"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm

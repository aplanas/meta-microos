SUMMARY = "Basic method declarations with signatures, without source filters"
DESCRIPTION = "Basic method declarations with signatures, without source filters"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Method-Signatures-Simple-1.07-1.25.noarch.rpm"
RPM_HASH = "78543f656f7830530f1d1db9ff40eea445cec08fc739db0e1c96e9ada432fb66b71a5f69e9b2e5d57508efe727fcf80da9ef8d749237d17e93c7bc15aae4a723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Method::Signatures::Simple) \
perl-Method-Signatures-Simple"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Devel::Declare)"

inherit rpm

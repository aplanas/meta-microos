SUMMARY = "Convert from POD to AsciiDoc"
DESCRIPTION = "Convert from POD to AsciiDoc"
LICENSE = "Apache-2.0"

PV = "0.101002"

RPM_NAME = "perl-Pod-AsciiDoctor-0.101002-1.1.noarch.rpm"
RPM_HASH = "92c56ee5549c4e61f134b025196b98cf5a4dd201bb3e634569ea899b99c36fa4e1c50263fd09747af41a532916ee27e4c98f4467e4fa824e6575871643bd121d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Pod::AsciiDoctor) \
perl-Pod-AsciiDoctor"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Pod::Parser) \
perl(parent)"

inherit rpm

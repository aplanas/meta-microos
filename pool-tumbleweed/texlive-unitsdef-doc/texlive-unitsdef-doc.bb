SUMMARY = "Documentation for texlive-unitsdef"
DESCRIPTION = "This package includes the documentation for texlive-unitsdef"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-unitsdef-doc-2023.201.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "326cd4d3afee2f5a0318dcb89dc2d11bcc3276a4fa19564e520ec235fc44d28a4f97b41cd01d80302693bb863c9aaeac9664434066446c539e8aa291f665b727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unitsdef-doc"
RDEPENDS:${PN} += ""

inherit rpm

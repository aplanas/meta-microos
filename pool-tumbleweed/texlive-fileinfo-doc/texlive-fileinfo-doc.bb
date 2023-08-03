SUMMARY = "Documentation for texlive-fileinfo"
DESCRIPTION = "This package includes the documentation for texlive-fileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.81asvn28421"

RPM_NAME = "texlive-fileinfo-doc-2023.209.0.0.81asvn28421-53.1.noarch.rpm"
RPM_HASH = "2cd729194bbea64ca1cca0f31f23e7d19d9645fd19975f7cf70bac8c33606165b730588f220bc2e155fa4de383e03cdd35e03f8664b6302230e7b88251d4adb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fileinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm

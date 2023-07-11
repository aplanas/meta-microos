SUMMARY = "Documentation for texlive-easylist"
DESCRIPTION = "This package includes the documentation for texlive-easylist"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn32661"

RPM_NAME = "texlive-easylist-doc-2023.201.1.3svn32661-53.2.noarch.rpm"
RPM_HASH = "6dcc7cf739c50885217a5378d389beee08622582032efeb99f36efdd694f3a89d49e327e25490729a3be8ba4ba8907009f82d9392fb587a3683c2be374d42eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easylist-doc"

RDEPENDS:${PN} += ""

inherit rpm

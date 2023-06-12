SUMMARY = "Documentation for texlive-bredzenie"
DESCRIPTION = "This package includes the documentation for texlive-bredzenie"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44371"

RPM_NAME = "texlive-bredzenie-doc-2023.201.1.0svn44371-52.1.noarch.rpm"
RPM_HASH = "0d0d8e00ed04ccd4d5fb830786ae3346df03fc391889387f2a8ac9d36529630fb7f58efd46eaa2f62b5bdf89528bfb408995f5f3dd875950a91f28bf0bc55839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bredzenie-doc"
RDEPENDS:${PN} += ""

inherit rpm

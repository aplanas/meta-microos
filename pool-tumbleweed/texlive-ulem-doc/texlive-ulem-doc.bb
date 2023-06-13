SUMMARY = "Documentation for texlive-ulem"
DESCRIPTION = "This package includes the documentation for texlive-ulem"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53365"

RPM_NAME = "texlive-ulem-doc-2023.201.svn53365-53.1.noarch.rpm"
RPM_HASH = "edadd42ba640f1b446a0f63a5200099fb822493828492a3ed1729256cece77333ef47e87648cd82452bd7a39d0ffdeb01ba58357a0cfe185c47457c4b7297308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ulem-doc"

RDEPENDS:${PN} += ""

inherit rpm

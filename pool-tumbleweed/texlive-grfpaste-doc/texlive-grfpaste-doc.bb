SUMMARY = "Documentation for texlive-grfpaste"
DESCRIPTION = "This package includes the documentation for texlive-grfpaste"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn17354"

RPM_NAME = "texlive-grfpaste-doc-2023.201.0.0.2svn17354-53.1.noarch.rpm"
RPM_HASH = "d6ba6aa37793b29d84008bb1184379e97f5825975ee0e366a6a7263d18c530a249628d20be54ca8e039558e14954076f1ce062a5f404f9174a7b0301d2b6d407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grfpaste-doc"
RDEPENDS:${PN} += ""

inherit rpm

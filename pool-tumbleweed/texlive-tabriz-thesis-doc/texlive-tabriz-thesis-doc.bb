SUMMARY = "Documentation for texlive-tabriz-thesis"
DESCRIPTION = "This package includes the documentation for texlive-tabriz-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn51729"

RPM_NAME = "texlive-tabriz-thesis-doc-2023.209.1.1svn51729-55.1.noarch.rpm"
RPM_HASH = "0d37fb48018ed7aa3cdc29bb9ea562f7ddde6c0b6242679f14d387b6c094bd0891ac0000cfefc57101265f373e11282c0c1910fcaa27c4700e755730adb5d236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tabriz-thesis-doc-fa \
texlive-tabriz-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm

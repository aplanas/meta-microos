SUMMARY = "Documentation for texlive-uowthesistitlepage"
DESCRIPTION = "This package includes the documentation for texlive-uowthesistitlepage"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.1svn54512"

RPM_NAME = "texlive-uowthesistitlepage-doc-2023.201.3.0.1svn54512-53.1.noarch.rpm"
RPM_HASH = "11242c30371e16792109af25cbee2e925a4c45194bf3fe280ae7a6e99f791f316a27cf28add891f1c22713204c2176015ca95f7f7de4b50f207ef79a55308644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uowthesistitlepage-doc"
RDEPENDS:${PN} += ""

inherit rpm

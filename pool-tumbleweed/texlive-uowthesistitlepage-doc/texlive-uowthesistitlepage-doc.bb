SUMMARY = "Documentation for texlive-uowthesistitlepage"
DESCRIPTION = "This package includes the documentation for texlive-uowthesistitlepage"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0.1svn54512"

RPM_NAME = "texlive-uowthesistitlepage-doc-2023.209.3.0.1svn54512-54.1.noarch.rpm"
RPM_HASH = "e2d34aa72074d7ab33410ad62f2df532afa166f421879bb463d19dbd2b7c5e370f9ca5853daba7df95630dc67a2a6b523140213435467e04423ca975a5d7ffbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uowthesistitlepage-doc"

RDEPENDS:${PN} += ""

inherit rpm

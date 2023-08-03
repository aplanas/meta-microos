SUMMARY = "Documentation for texlive-fonts-churchslavonic"
DESCRIPTION = "This package includes the documentation for texlive-fonts-churchslavonic"
LICENSE = "OFL-1.1"

PV = "2023.209.2.2svn56350"

RPM_NAME = "texlive-fonts-churchslavonic-doc-2023.209.2.2svn56350-53.1.noarch.rpm"
RPM_HASH = "8cf7a7084f32b49813f5fb63b77443bf733ad7f9f415d196598d80b8261d7171676c4b761065f5198c76be672f175475944b3fcce74e019926105fb91132a7a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonts-churchslavonic-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-hausarbeit-jura"
DESCRIPTION = "This package includes the documentation for texlive-hausarbeit-jura"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn56070"

RPM_NAME = "texlive-hausarbeit-jura-doc-2023.209.2.1.0svn56070-54.2.noarch.rpm"
RPM_HASH = "0ef0adfcbb7dcd2df3ff4e8d9a3b77781ab171f72362ebe19892fea324f5e19f173402345f1c1969485bcf79b215032bd09189fc008e1912371077ff75781cee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hausarbeit-jura-doc-de \
texlive-hausarbeit-jura-doc"

RDEPENDS:${PN} += ""

inherit rpm

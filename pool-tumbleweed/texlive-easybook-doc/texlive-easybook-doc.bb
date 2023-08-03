SUMMARY = "Documentation for texlive-easybook"
DESCRIPTION = "This package includes the documentation for texlive-easybook"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.71dsvn64976"

RPM_NAME = "texlive-easybook-doc-2023.209.1.71dsvn64976-54.1.noarch.rpm"
RPM_HASH = "4dbe04c84f36390385da874d13d26516eaed24143946b1764a4b74e6b317d6bc77ab71a3fe955a37c5b07e6039b22114f2dbd6982ec84d7be69de205c77efdee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-easybook-doc-zh \
texlive-easybook-doc"

RDEPENDS:${PN} += ""

inherit rpm

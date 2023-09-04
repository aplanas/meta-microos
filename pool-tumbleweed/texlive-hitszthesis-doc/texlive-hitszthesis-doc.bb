SUMMARY = "Documentation for texlive-hitszthesis"
DESCRIPTION = "This package includes the documentation for texlive-hitszthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.1svn61073"

RPM_NAME = "texlive-hitszthesis-doc-2023.209.3.2.1svn61073-54.2.noarch.rpm"
RPM_HASH = "9b0cd11e93cb3a926f34e3fb9d31e7cda7f0e9705aeba1e47a35c63b53429197ff2a6e807766975964df1f77b699853b7874b963ed49029514148feb9c51b9e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitszthesis-doc-zh \
texlive-hitszthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm

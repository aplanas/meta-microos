SUMMARY = "Documentation for texlive-dingbat"
DESCRIPTION = "This package includes the documentation for texlive-dingbat"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn27918"

RPM_NAME = "texlive-dingbat-doc-2023.201.1.0svn27918-52.1.noarch.rpm"
RPM_HASH = "15db90d84c5e4af5aeb95583fc93969f042626adc6ba9a8192903636a99a311a0e1a736d7cf9726227f0c20edab8f95deb5323c743a990c252219ca3029696c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dingbat-doc"
RDEPENDS:${PN} += ""

inherit rpm

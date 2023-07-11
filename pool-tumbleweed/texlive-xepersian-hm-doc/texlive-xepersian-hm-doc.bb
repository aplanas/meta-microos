SUMMARY = "Documentation for texlive-xepersian-hm"
DESCRIPTION = "This package includes the documentation for texlive-xepersian-hm"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn56272"

RPM_NAME = "texlive-xepersian-hm-doc-2023.201.1.1asvn56272-52.2.noarch.rpm"
RPM_HASH = "413988f217578c1a815f06cf71a249f8dd2c3ff5cf89680196f73c7fff0e07a1513383b3672ce92591b633113812712b961aee7a92565ce2dfb83f6ccaffbee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xepersian-hm-doc-fa \
texlive-xepersian-hm-doc"

RDEPENDS:${PN} += ""

inherit rpm

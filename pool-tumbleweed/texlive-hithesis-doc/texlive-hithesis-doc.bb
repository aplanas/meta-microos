SUMMARY = "Documentation for texlive-hithesis"
DESCRIPTION = "This package includes the documentation for texlive-hithesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.11svn64005"

RPM_NAME = "texlive-hithesis-doc-2023.201.2.0.11svn64005-53.2.noarch.rpm"
RPM_HASH = "49498562aadcd044cb842727a5015d2bc174008332c0cb78a7bc6564eda33f6984ad2023f79a642a51c929bea619ee1de21b21b6157fdda1d5606d8833b89b4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hithesis-doc-zh \
texlive-hithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm

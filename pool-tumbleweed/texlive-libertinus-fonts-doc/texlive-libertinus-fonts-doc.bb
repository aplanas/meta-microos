SUMMARY = "Documentation for texlive-libertinus-fonts"
DESCRIPTION = "This package includes the documentation for texlive-libertinus-fonts"
LICENSE = "OFL-1.1"

PV = "2023.209.7.040svn57948"

RPM_NAME = "texlive-libertinus-fonts-doc-2023.209.7.040svn57948-55.1.noarch.rpm"
RPM_HASH = "f311e8f23fee339ccbaa7f1d0852c59c56d7fd4c2101757a08e770f1db5200c0dcb32f240102420a2743d0eb218c88020754fce41bfbee6b5ed00c48ae3961fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm

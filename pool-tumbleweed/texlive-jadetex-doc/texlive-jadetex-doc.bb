SUMMARY = "Documentation for texlive-jadetex"
DESCRIPTION = "This package includes the documentation for texlive-jadetex"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.13svn63654"

RPM_NAME = "texlive-jadetex-doc-2023.201.3.13svn63654-55.1.noarch.rpm"
RPM_HASH = "f7708d749c8cbb131fe3dedb9226e42fbefecdc7df346504d975a9e28f884af9c5d786f777d8754fdf7d79f7acebf8f9e7c7a4035428d4376f8b6a474fb9a202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(jadetex.1) \
man(pdfjadetex.1) \
texlive-jadetex-doc"

RDEPENDS:${PN} += ""

inherit rpm

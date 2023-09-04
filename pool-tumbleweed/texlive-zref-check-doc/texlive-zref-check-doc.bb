SUMMARY = "Documentation for texlive-zref-check"
DESCRIPTION = "This package includes the documentation for texlive-zref-check"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.2svn63845"

RPM_NAME = "texlive-zref-check-doc-2023.209.0.0.3.2svn63845-53.2.noarch.rpm"
RPM_HASH = "37a0a60fb93b40bc7d63a72c479644d06d7f1e31197850ea3cd1a18cab0061785b6894cab728e01f2c5e96a1dc2bdc59daf1caa81d296e59270979872b791d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-check-doc"

RDEPENDS:${PN} += ""

inherit rpm

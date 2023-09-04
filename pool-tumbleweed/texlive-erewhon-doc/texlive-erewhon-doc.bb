SUMMARY = "Documentation for texlive-erewhon"
DESCRIPTION = "This package includes the documentation for texlive-erewhon"
LICENSE = "OFL-1.1"

PV = "2023.209.1.12svn63312"

RPM_NAME = "texlive-erewhon-doc-2023.209.1.12svn63312-54.2.noarch.rpm"
RPM_HASH = "2440657b24096ce3f1c9060fe06d976f22e561fc31efb7261f4a925d2f7855dea2935abd570665644ed7638ae0f8cfa5eee4aef1b03f484c2f224820b9176a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erewhon-doc"

RDEPENDS:${PN} += ""

inherit rpm

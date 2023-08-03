SUMMARY = "Documentation for texlive-thesis-ekf"
DESCRIPTION = "This package includes the documentation for texlive-thesis-ekf"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn60228"

RPM_NAME = "texlive-thesis-ekf-doc-2023.209.4.2svn60228-55.1.noarch.rpm"
RPM_HASH = "7026f9449a2870d9d1c5f1452d073361acf81f32a03edf1720131da6ec0ce4941b65a3e7ed7e89fb7e04d831aa966591c1344848454461ec86fec42e028d9eb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thesis-ekf-doc-hu \
texlive-thesis-ekf-doc"

RDEPENDS:${PN} += ""

inherit rpm

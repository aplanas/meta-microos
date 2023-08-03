SUMMARY = "Documentation for texlive-buctthesis"
DESCRIPTION = "This package includes the documentation for texlive-buctthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.1svn64004"

RPM_NAME = "texlive-buctthesis-doc-2023.209.1.4.1svn64004-53.1.noarch.rpm"
RPM_HASH = "ff1971ecae81d33d8c732c5b0656bde9682c2a2e16507ca6abb881a5cbe1465b1b86d652adf40657f574f18dc9764b14bb05a64d9fe1acf499c25960edcabc1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-buctthesis-doc-zh \
texlive-buctthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm

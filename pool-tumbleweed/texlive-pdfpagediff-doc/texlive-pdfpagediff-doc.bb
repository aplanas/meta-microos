SUMMARY = "Documentation for texlive-pdfpagediff"
DESCRIPTION = "This package includes the documentation for texlive-pdfpagediff"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn37946"

RPM_NAME = "texlive-pdfpagediff-doc-2023.209.1.4svn37946-52.1.noarch.rpm"
RPM_HASH = "ce6aeff330b6525bc0da71567e15d92a1e895c1b04142344e321e5a808030d14fadcf3e47366c7c288f84f2a740bb756c81493ea8d1a18cca0b73644d17839ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfpagediff-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-pdftex"
DESCRIPTION = "This package includes the documentation for texlive-pdftex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66243"

RPM_NAME = "texlive-pdftex-doc-2023.201.svn66243-51.1.noarch.rpm"
RPM_HASH = "f36752021d6af11f663f9e229772a385fcb00e9a9d0c490e08c35341e2c951a0e052a067a4e069feb60e1784aa05723aaafe2c5cb8f0b6b037f82335e289a7cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(pdfetex.1) \
man(pdftex.1) \
texlive-pdftex-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm

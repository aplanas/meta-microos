SUMMARY = "Documentation for texlive-pgfornament-han"
DESCRIPTION = "This package includes the documentation for texlive-pgfornament-han"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54191"

RPM_NAME = "texlive-pgfornament-han-doc-2023.209.svn54191-52.1.noarch.rpm"
RPM_HASH = "6079f66f7500cd35cfef356aa809a37232cbce70328294ce7e978037de9cf06f6170ce9f9804bbaa8164bb9bf24c410789a1559381578910881744f1cd777cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pgfornament-han-doc-zh \
texlive-pgfornament-han-doc"

RDEPENDS:${PN} += ""

inherit rpm

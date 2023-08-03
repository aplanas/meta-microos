SUMMARY = "Documentation for texlive-auto-pst-pdf"
DESCRIPTION = "This package includes the documentation for texlive-auto-pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn56596"

RPM_NAME = "texlive-auto-pst-pdf-doc-2023.209.0.0.7svn56596-54.1.noarch.rpm"
RPM_HASH = "174b79d87130e970338d0d34abde4903f7751d460d3152aef004379aa43b69d6b1f5cd96786bd5b41bf50edcdb7a80aac6b79459613a04680e096518cb91b641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-auto-pst-pdf-doc-en \
texlive-auto-pst-pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm

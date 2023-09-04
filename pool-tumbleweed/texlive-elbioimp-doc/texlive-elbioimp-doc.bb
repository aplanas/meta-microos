SUMMARY = "Documentation for texlive-elbioimp"
DESCRIPTION = "This package includes the documentation for texlive-elbioimp"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn21758"

RPM_NAME = "texlive-elbioimp-doc-2023.209.1.2svn21758-54.2.noarch.rpm"
RPM_HASH = "5866700bc5e41a904cce6d7923e36f4cdff27b4be55a1f2b94408659e6b84fb0a1a0eafc2949e50947b69cfa9da5655c0e1d5a67c8c1445171752fb1ecb9b725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elbioimp-doc"

RDEPENDS:${PN} += ""

inherit rpm

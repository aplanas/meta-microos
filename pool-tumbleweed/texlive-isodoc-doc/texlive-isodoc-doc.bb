SUMMARY = "Documentation for texlive-isodoc"
DESCRIPTION = "This package includes the documentation for texlive-isodoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.14svn59709"

RPM_NAME = "texlive-isodoc-doc-2023.209.1.14svn59709-56.1.noarch.rpm"
RPM_HASH = "a50923587186e1a67a3e91b85d1c1f9790746397c6dae7b6b29b451beaf360b440ca3f0b073c3083bdabd017df0995e11a2319f886a79eaf518b34d92f886900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isodoc-doc"

RDEPENDS:${PN} += ""

inherit rpm

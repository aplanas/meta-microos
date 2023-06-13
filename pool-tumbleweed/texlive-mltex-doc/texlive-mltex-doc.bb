SUMMARY = "Documentation for texlive-mltex"
DESCRIPTION = "This package includes the documentation for texlive-mltex"
LICENSE = "SUSE-TeX"

PV = "2023.201.2.2svn62145"

RPM_NAME = "texlive-mltex-doc-2023.201.2.2svn62145-54.1.noarch.rpm"
RPM_HASH = "30afc6c5e5dcf8119527833375270fb1d475c890404906ba550dfd5af2c4bee1d536f297c13a254197995ae504cb4520185d615e618bff524a1a9af34b039c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mltex-doc"

RDEPENDS:${PN} += ""

inherit rpm

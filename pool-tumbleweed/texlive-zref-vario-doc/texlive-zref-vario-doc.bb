SUMMARY = "Documentation for texlive-zref-vario"
DESCRIPTION = "This package includes the documentation for texlive-zref-vario"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.7svn65453"

RPM_NAME = "texlive-zref-vario-doc-2023.201.0.0.1.7svn65453-52.2.noarch.rpm"
RPM_HASH = "80916d8afcfe04cf5ff4634e4a42103aaa032f55625587de64b31c5620b21d440d35c7e19857049e57608686eec36237985a22a1f125b789f5d12ca70cf2ecdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-vario-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-hypernat"
DESCRIPTION = "This package includes the documentation for texlive-hypernat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0bsvn17358"

RPM_NAME = "texlive-hypernat-doc-2023.209.1.0bsvn17358-54.1.noarch.rpm"
RPM_HASH = "2be21adcc0cd4e976faefc829f9861a3a2ab3d90eff3ac104db5e5d9e8a43c9953a1552c6caf402ee336cc8477a26645bdcc7b7ee6814d77ba9f9533dfaaa1eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypernat-doc"

RDEPENDS:${PN} += ""

inherit rpm

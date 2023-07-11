SUMMARY = "Documentation for texlive-ydoc"
DESCRIPTION = "This package includes the documentation for texlive-ydoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7alphasvn64887"

RPM_NAME = "texlive-ydoc-doc-2023.201.0.0.7alphasvn64887-52.2.noarch.rpm"
RPM_HASH = "f31f0728c10111afb0c3a2c35ec0c271b558b5ce47c23cb93eacf58868e645062e4b5016aa5a335489d80128a97095112545489165cbed0d95b72e055c88c183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ydoc-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-qpxqtx"
DESCRIPTION = "This package includes the documentation for texlive-qpxqtx"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45797"

RPM_NAME = "texlive-qpxqtx-doc-2023.201.svn45797-53.2.noarch.rpm"
RPM_HASH = "ed078acdc7f23f07c93cc5365d0afb0ab059f0bb8e7110fd639581bceadee8cbff29dc918b888d7b460936c561b2e4e8b7240a9c628fbd20da9c8edc9e30c6b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qpxqtx-doc"

RDEPENDS:${PN} += ""

inherit rpm

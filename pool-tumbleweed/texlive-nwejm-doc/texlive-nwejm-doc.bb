SUMMARY = "Documentation for texlive-nwejm"
DESCRIPTION = "This package includes the documentation for texlive-nwejm"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.5svn64462"

RPM_NAME = "texlive-nwejm-doc-2023.201.1.0.5svn64462-54.1.noarch.rpm"
RPM_HASH = "05094f1ca3f6f5ebbb8562336bc03a367001a1315d934d766baa85d22bda30d5bb9a16c451d4b2735ae4672077433dd930b6e9eab6910a01869a89f9d647cfb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-nwejm-doc:fr) \
texlive-nwejm-doc"

RDEPENDS:${PN} += ""

inherit rpm

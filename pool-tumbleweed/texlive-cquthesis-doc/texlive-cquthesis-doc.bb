SUMMARY = "Documentation for texlive-cquthesis"
DESCRIPTION = "This package includes the documentation for texlive-cquthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.50svn55643"

RPM_NAME = "texlive-cquthesis-doc-2023.209.1.50svn55643-55.1.noarch.rpm"
RPM_HASH = "8d7bbe1184f6b5c7b50bb24a0c66030d4c8ab4d6d6477884dc2dc2ba4773d5f56fa367bf4b4f07d95a93fe4f0d228fb44f5fb8ff80a890b9f46f19c6f0ecd2ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cquthesis-doc-zh \
texlive-cquthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm

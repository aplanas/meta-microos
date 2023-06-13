SUMMARY = "Documentation for texlive-cquthesis"
DESCRIPTION = "This package includes the documentation for texlive-cquthesis"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.50svn55643"

RPM_NAME = "texlive-cquthesis-doc-2023.204.1.50svn55643-54.1.noarch.rpm"
RPM_HASH = "48d1e5c2ff4b9b15383f847ed551e6ed04146c74eb90c43f693e5472c2a9809e7b1f57f28ab15a221cda6b60a1f24ffa4bc8cb4bf80adeee886df64e2a7f54b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-cquthesis-doc:zh) \
texlive-cquthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "API documentation for LHAPDF, a library for PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. \
 \
This package provides the API documentation for LHAPDF in HTML format."
LICENSE = "GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "LHAPDF-doc-6.5.4-1.1.noarch.rpm"
RPM_HASH = "5a1ab3372a4842c1f93aa6561fe08ad1c91e665c1708f81847a46a5d7fd64a508604faafb82958f1a4f56f21b8e7022a52615720f4a4a7eec249fa60b6b50840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "LHAPDF-doc"

RDEPENDS:${PN} += ""

inherit rpm

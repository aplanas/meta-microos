SUMMARY = "API documentation for LHAPDF, a library for PDF sets"
DESCRIPTION = "LHAPDF provides a unified and interface to PDF (probability \
distribution function) sets. \
 \
This package provides the API documentation for LHAPDF in HTML format."
LICENSE = "GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "LHAPDF-doc-6.5.4-1.2.noarch.rpm"
RPM_HASH = "fdfe2543c698c58edcc38c995d324065cccd50ddbb2f74f335d604cc53c9be3d736f42b42b1a08017bb76f6d3d400eb4da307fd697379125103dde6d6a615c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "LHAPDF-doc"

RDEPENDS:${PN} += ""

inherit rpm

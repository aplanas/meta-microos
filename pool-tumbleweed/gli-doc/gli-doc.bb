SUMMARY = "Documentation for GLI library"
DESCRIPTION = "This package provides the documentation for GLI library."
LICENSE = "GPL-2.0-only & MIT"

PV = "0.8.2.0"

RPM_NAME = "gli-doc-0.8.2.0-4.4.noarch.rpm"
RPM_HASH = "f32730533ce8d4bd14647c288a644f4cf0997385c3c27beece88674180e9ef7abbe6024c34fc650bc92e603a4feb0cf4aacc5a9e27dd6f10e718ff70bc18f5ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gli-doc"

RDEPENDS:${PN} += ""

inherit rpm

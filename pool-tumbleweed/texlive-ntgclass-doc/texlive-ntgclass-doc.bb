SUMMARY = "Documentation for texlive-ntgclass"
DESCRIPTION = "This package includes the documentation for texlive-ntgclass"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1fsvn65522"

RPM_NAME = "texlive-ntgclass-doc-2023.201.2.1fsvn65522-54.1.noarch.rpm"
RPM_HASH = "b7f382a2b5bf3c1e07d2c49ecb3ffd6d8e772f032134dc90edd1d7d32a0eb1944b97750a93027734dcef0144f4f9e7818c825c48877de3385d7a1ba6e77f3fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-ntgclass-doc:nl) \
texlive-ntgclass-doc"

RDEPENDS:${PN} += ""

inherit rpm

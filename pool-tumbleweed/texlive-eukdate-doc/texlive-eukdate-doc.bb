SUMMARY = "Documentation for texlive-eukdate"
DESCRIPTION = "This package includes the documentation for texlive-eukdate"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.04svn15878"

RPM_NAME = "texlive-eukdate-doc-2023.209.1.04svn15878-53.1.noarch.rpm"
RPM_HASH = "19aa085507c291c6cc3bcf3faf36b572e6f9f7ed1f73a632b7c49dbec2e9959fe98561d1fa0db26a20ca1c7d6090f3b0f11f111013e51d2d136e249ee708653f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eukdate-doc"

RDEPENDS:${PN} += ""

inherit rpm

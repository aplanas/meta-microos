SUMMARY = "Documentation for texlive-svg"
DESCRIPTION = "This package includes the documentation for texlive-svg"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.02ksvn57010"

RPM_NAME = "texlive-svg-doc-2023.209.2.02ksvn57010-58.1.noarch.rpm"
RPM_HASH = "ed2f5a4826a851a9c3b7a03afdbdd43b6c6a60de0ef03b5e195b2af8c520961f0841442c6343fbc2d1e4a5e5e07f8c8878e82bc6d0bdbdce2e806f2e71e10aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svg-doc"

RDEPENDS:${PN} += ""

inherit rpm

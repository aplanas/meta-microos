SUMMARY = "Documentation for texlive-lualatex-math"
DESCRIPTION = "This package includes the documentation for texlive-lualatex-math"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.12svn61464"

RPM_NAME = "texlive-lualatex-math-doc-2023.208.1.12svn61464-53.1.noarch.rpm"
RPM_HASH = "e93849cc692568cd1524adb4c4f0b4e93032e62db7c258f3ba1ba352835d53f9ef9e98433ee26b5f55b18c308d814b175874d8edf5222e0638514a01044cbff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-lualatex-math-doc-en \
texlive-lualatex-math-doc"

RDEPENDS:${PN} += ""

inherit rpm

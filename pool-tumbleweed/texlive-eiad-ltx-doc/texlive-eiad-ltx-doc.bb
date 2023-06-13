SUMMARY = "Documentation for texlive-eiad-ltx"
DESCRIPTION = "This package includes the documentation for texlive-eiad-ltx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-eiad-ltx-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "a3576f0e6c65a1439244c44224f42f3d5003efb0d62bc2baefda9bebfc758feccf31cccbe84436b405fd1d03a5cf3de29c83d356216a96c49e19e3da23964a5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eiad-ltx-doc"

RDEPENDS:${PN} += ""

inherit rpm

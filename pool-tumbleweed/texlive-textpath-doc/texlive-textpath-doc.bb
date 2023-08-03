SUMMARY = "Documentation for texlive-textpath"
DESCRIPTION = "This package includes the documentation for texlive-textpath"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn15878"

RPM_NAME = "texlive-textpath-doc-2023.209.1.6svn15878-55.1.noarch.rpm"
RPM_HASH = "f879e61db781fdf3578bc5f914a34cf3149d2a37aa7d96dde3dcd46cf32dfc2f87612d6daa9dc404db25a90b276cb2f4a3f101e6f26e25e98786e98239b8ba60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textpath-doc"

RDEPENDS:${PN} += ""

inherit rpm

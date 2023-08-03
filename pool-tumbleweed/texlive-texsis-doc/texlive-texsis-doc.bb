SUMMARY = "Documentation for texlive-texsis"
DESCRIPTION = "This package includes the documentation for texlive-texsis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.18svn45678"

RPM_NAME = "texlive-texsis-doc-2023.209.2.18svn45678-55.1.noarch.rpm"
RPM_HASH = "30758129f3f63d862b7f7df1b9d015e8ae735096f0f95290e33e7fa70e776847ff0f265f7cea6f2a000c105909d734d6b867d5ecc899e3ca44064d70a6ba4a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texsis.1 \
texlive-texsis-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

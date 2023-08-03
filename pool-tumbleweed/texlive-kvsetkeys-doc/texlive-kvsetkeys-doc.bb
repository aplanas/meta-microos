SUMMARY = "Documentation for texlive-kvsetkeys"
DESCRIPTION = "This package includes the documentation for texlive-kvsetkeys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.19svn64632"

RPM_NAME = "texlive-kvsetkeys-doc-2023.209.1.19svn64632-56.1.noarch.rpm"
RPM_HASH = "b034b707a2f28845caa8fcea848b30165c2bd107a64d5dde466a1617785239bd007c8f2eb78d742070f0f7dae6dc7ccd2d4227b090b1d28aca3297198673bb86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kvsetkeys-doc-en \
texlive-kvsetkeys-doc"

RDEPENDS:${PN} += ""

inherit rpm

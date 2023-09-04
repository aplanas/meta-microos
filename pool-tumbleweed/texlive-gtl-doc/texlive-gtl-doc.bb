SUMMARY = "Documentation for texlive-gtl"
DESCRIPTION = "This package includes the documentation for texlive-gtl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn49527"

RPM_NAME = "texlive-gtl-doc-2023.209.0.0.5svn49527-54.2.noarch.rpm"
RPM_HASH = "28f157315af68896ed47b1b284a5bfea807e4efaf984ef42bab7a45fddfca3f105c9f745ea5cb9b52c09845364bb75f1149cf66b1d607d69e1349f5bccc18d47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtl-doc"

RDEPENDS:${PN} += ""

inherit rpm

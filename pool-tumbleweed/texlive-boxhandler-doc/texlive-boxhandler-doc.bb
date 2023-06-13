SUMMARY = "Documentation for texlive-boxhandler"
DESCRIPTION = "This package includes the documentation for texlive-boxhandler"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.30svn28031"

RPM_NAME = "texlive-boxhandler-doc-2023.201.1.30svn28031-52.1.noarch.rpm"
RPM_HASH = "197a21e18bd4b1ea65dafb7bac1d1a1dc6bbbf2b7150f90259e7ea7f25abcfb047b8e6c9d4d5a36f032566219f6e0440247dbac5e9b0fc78a3e57d2722336a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boxhandler-doc"

RDEPENDS:${PN} += ""

inherit rpm

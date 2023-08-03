SUMMARY = "Documentation for texlive-cellprops"
DESCRIPTION = "This package includes the documentation for texlive-cellprops"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0svn57599"

RPM_NAME = "texlive-cellprops-doc-2023.209.2.0svn57599-53.1.noarch.rpm"
RPM_HASH = "3459fdff1f7bf3151c3711964a9adbb0233e6ef408ef0277989f0970012e04c17202c24622b01e3e0ad2093298d79c9a3fba50daae5e9b4053cdafd79ff16f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cellprops-doc"

RDEPENDS:${PN} += ""

inherit rpm

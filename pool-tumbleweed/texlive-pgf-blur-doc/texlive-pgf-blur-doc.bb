SUMMARY = "Documentation for texlive-pgf-blur"
DESCRIPTION = "This package includes the documentation for texlive-pgf-blur"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn54512"

RPM_NAME = "texlive-pgf-blur-doc-2023.201.1.02svn54512-51.1.noarch.rpm"
RPM_HASH = "4e925758e573b319e368fa5858d062cc516a85fa0abf2490e5f5a311bf3b7587c139f41a2ef365f4c312f87fe5a6f9cb5fbc583a634a15ece3406bbb5370682f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-blur-doc"

RDEPENDS:${PN} += ""

inherit rpm

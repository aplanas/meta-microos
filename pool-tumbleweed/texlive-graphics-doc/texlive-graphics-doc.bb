SUMMARY = "Documentation for texlive-graphics"
DESCRIPTION = "This package includes the documentation for texlive-graphics"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66204"

RPM_NAME = "texlive-graphics-doc-2023.209.svn66204-54.1.noarch.rpm"
RPM_HASH = "a1a700da00479fe64b32649f8af1a9bc0b5289f4ae2cd78540f379a35fe2a58fe0f2c4403bd2559445eb97ea5f60ebad0b5317131a79b35dec607e482ccee0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-doc"

RDEPENDS:${PN} += ""

inherit rpm

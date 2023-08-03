SUMMARY = "Documentation for texlive-stex"
DESCRIPTION = "This package includes the documentation for texlive-stex"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.0svn64383"

RPM_NAME = "texlive-stex-doc-2023.209.3.2.0svn64383-58.1.noarch.rpm"
RPM_HASH = "e3dc79907882828f0cb53aa63943f70e3fdff57f780b2c0b96d0e1d52397b03ec43851146f3247102d14f3c8fe6c3fda168c71dafd1a77cc6910576e102bc37c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stex-doc"

RDEPENDS:${PN} += ""

inherit rpm

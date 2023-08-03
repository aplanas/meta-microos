SUMMARY = "Documentation for texlive-velthuis"
DESCRIPTION = "This package includes the documentation for texlive-velthuis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.17.1svn66186"

RPM_NAME = "texlive-velthuis-doc-2023.209.2.17.1svn66186-54.1.noarch.rpm"
RPM_HASH = "b86b7c7729c1d9a4cc386430d76c642f0e662ea68da604e693203fa04547c8e3c63de1a8c46fb339d8bf854f74ca1296bcf709622abe8994ee94ad81277fc7ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-devnag.1 \
texlive-velthuis-doc"

RDEPENDS:${PN} += ""

inherit rpm

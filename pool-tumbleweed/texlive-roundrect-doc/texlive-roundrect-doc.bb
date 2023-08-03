SUMMARY = "Documentation for texlive-roundrect"
DESCRIPTION = "This package includes the documentation for texlive-roundrect"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn39796"

RPM_NAME = "texlive-roundrect-doc-2023.209.2.2svn39796-54.1.noarch.rpm"
RPM_HASH = "9ec412815bc0c6583699c65d94e9bd4ceed00fc50454a72a638df3d644b217a50bc44e5162d5894be7a10adcf00dbcceee2a81cccc44c149d8dd450ec0c3ff02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roundrect-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Documentation for texlive-pinlabel"
DESCRIPTION = "This package includes the documentation for texlive-pinlabel"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn24769"

RPM_NAME = "texlive-pinlabel-doc-2023.201.1.2svn24769-51.1.noarch.rpm"
RPM_HASH = "1151de8dae72d04a04ceac4eb078be8a1695648d700790b0a1568ba00cb928369bb10dc1d250c67dffe700186f4f863277c0006e29989e5584cc772fd1178d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pinlabel-doc"
RDEPENDS:${PN} += ""

inherit rpm

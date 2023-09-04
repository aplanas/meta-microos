SUMMARY = "Binary files of albatross"
DESCRIPTION = "Binary files of albatross"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn57089"

RPM_NAME = "texlive-albatross-bin-2023.20230311.svn57089-93.2.aarch64.rpm"
RPM_HASH = "8ce94262ab2076e46883d0d87fe323837fbc8715100380705f78be2f295642dbc899f845232a33035167584d6a10cadd72eefa6ca2dd4c0dd2704d1ceeebc8c1"

RPROVIDES:${PN} += "texlive-albatross-bin"

RDEPENDS:${PN} += "texlive-albatross"

inherit rpm

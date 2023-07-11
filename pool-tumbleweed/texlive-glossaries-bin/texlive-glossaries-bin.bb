SUMMARY = "Binary files of glossaries"
DESCRIPTION = "Binary files of glossaries"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37813"

RPM_NAME = "texlive-glossaries-bin-2023.20230311.svn37813-92.1.aarch64.rpm"
RPM_HASH = "f5b4862250158518dc4dfe58d65d44bdc0b05e1a5bead4c9f4094e18e44c16db993fa12477c38270143a78d364757896fdd5dfddd4f3b4631c866d2e4e1e3934"

RPROVIDES:${PN} += "texlive-glossaries-bin"

RDEPENDS:${PN} += "texlive-glossaries"

inherit rpm

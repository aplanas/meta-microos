SUMMARY = "Binary files of arara"
DESCRIPTION = "Binary files of arara"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29036"

RPM_NAME = "texlive-arara-bin-2023.20230311.svn29036-92.1.aarch64.rpm"
RPM_HASH = "2e4d55959306329d9fe8c415c32028181377ddcc496558d7b7c758d63a1e2b952ef32c2e07caea427aa10f99238afb9edba316cecffbbba05cd973bf505bedb8"

RPROVIDES:${PN} += "texlive-arara-bin"

RDEPENDS:${PN} += "texlive-arara"

inherit rpm

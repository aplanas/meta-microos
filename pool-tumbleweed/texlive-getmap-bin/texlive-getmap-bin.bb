SUMMARY = "Binary files of getmap"
DESCRIPTION = "Binary files of getmap"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34971"

RPM_NAME = "texlive-getmap-bin-2023.20230311.svn34971-93.1.aarch64.rpm"
RPM_HASH = "b05cb01d8a95431311d4ad7f8577973d9fa023fe898a3b12556ef97bbe90f11040c1e7efcd8bd9f1b150385a8a02a7bfb6889bc4e4ec20bf98a1096c2f2c83da"

RPROVIDES:${PN} += "texlive-getmap-bin"

RDEPENDS:${PN} += "texlive-getmap"

inherit rpm

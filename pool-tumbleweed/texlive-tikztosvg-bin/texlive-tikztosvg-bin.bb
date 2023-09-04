SUMMARY = "Binary files of tikztosvg"
DESCRIPTION = "Binary files of tikztosvg"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn55132"

RPM_NAME = "texlive-tikztosvg-bin-2023.20230311.svn55132-93.2.aarch64.rpm"
RPM_HASH = "02f4a37bbc17fa6705a0618129fb9756ab8f1dd93f4249c7a3255d66071c0dad2bc58a95cc1055c7ed43e230bb9d198648e9dd1584d0c3850f2bd4129cde68c2"

RPROVIDES:${PN} += "texlive-tikztosvg-bin"

RDEPENDS:${PN} += "texlive-tikztosvg"

inherit rpm

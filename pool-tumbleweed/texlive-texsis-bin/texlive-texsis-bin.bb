SUMMARY = "Binary files of texsis"
DESCRIPTION = "Binary files of texsis"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-texsis-bin-2023.20230311.svn3006-92.1.aarch64.rpm"
RPM_HASH = "a5759e6ff7d95a54b210670e8492c027eb1cd09cb711c32f1e675e322d0f2ab58ffcab9c6b9183ab84699f6c64e95b61bbfe87dbc4531d34aa76e72d46283042"

RPROVIDES:${PN} += "texlive-texsis-bin"

RDEPENDS:${PN} += "texlive-texsis"

inherit rpm

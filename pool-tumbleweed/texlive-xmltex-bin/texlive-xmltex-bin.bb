SUMMARY = "Binary files of xmltex"
DESCRIPTION = "Binary files of xmltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-xmltex-bin-2023.20230311.svn3006-93.2.aarch64.rpm"
RPM_HASH = "11b7c672b1ed170b56e5527be501d7e851a2576f306eb1dcc78aaed958448f52313a5894fb98be498dc67e968a468500276bc5d562c8ee8df95b58c52a87c453"

RPROVIDES:${PN} += "texlive-xmltex-bin"

RDEPENDS:${PN} += "texlive-xmltex"

inherit rpm

SUMMARY = "Binary files of eplain"
DESCRIPTION = "Binary files of eplain"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-eplain-bin-2023.20230311.svn3006-93.2.aarch64.rpm"
RPM_HASH = "82fefda575499ea31fbc47d8963bcfc30fa82275b4d779e24650875027853f59d14792263fd81b429ed030260811f667896e2e1de0bf641f5eb7f40a8b0d0010"

RPROVIDES:${PN} += "texlive-eplain-bin"

RDEPENDS:${PN} += "texlive-eplain"

inherit rpm

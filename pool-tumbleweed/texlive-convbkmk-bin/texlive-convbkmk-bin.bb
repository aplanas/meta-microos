SUMMARY = "Binary files of convbkmk"
DESCRIPTION = "Binary files of convbkmk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30408"

RPM_NAME = "texlive-convbkmk-bin-2023.20230311.svn30408-93.1.aarch64.rpm"
RPM_HASH = "150716e2a552c5111e9bb663ac43029b5381f6b4b136003ed1bfb72083b4ab36237d35af05b30fb46502da1754233dcaf3020e62e15dd4083a7fefd14f11c49a"

RPROVIDES:${PN} += "texlive-convbkmk-bin"

RDEPENDS:${PN} += "texlive-convbkmk"

inherit rpm

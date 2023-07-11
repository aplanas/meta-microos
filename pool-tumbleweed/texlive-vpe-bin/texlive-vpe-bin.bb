SUMMARY = "Binary files of vpe"
DESCRIPTION = "Binary files of vpe"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn6897"

RPM_NAME = "texlive-vpe-bin-2023.20230311.svn6897-92.1.aarch64.rpm"
RPM_HASH = "5b18b933a029279622332c24cbe937f224f122faaf0a0f88f97af18641198caf674d31ee22c1ce1ca8d4d13d0724064ab9b29c77176cc1c3d2d0ffff1f64e61b"

RPROVIDES:${PN} += "texlive-vpe-bin"

RDEPENDS:${PN} += "texlive-vpe"

inherit rpm

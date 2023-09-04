SUMMARY = "Binary files of amstex"
DESCRIPTION = "Binary files of amstex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-amstex-bin-2023.20230311.svn3006-93.2.aarch64.rpm"
RPM_HASH = "29257e44f7a21011e5c08fe04612968e4973cf3cd973e5f00debd62cac0e306f6a4d629abf919d21a31fe38ce8d3e56018990aa9472e35021d663f70430b56af"

RPROVIDES:${PN} += "texlive-amstex-bin"

RDEPENDS:${PN} += "texlive-amstex"

inherit rpm

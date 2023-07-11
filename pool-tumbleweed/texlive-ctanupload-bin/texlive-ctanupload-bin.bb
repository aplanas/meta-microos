SUMMARY = "Binary files of ctanupload"
DESCRIPTION = "Binary files of ctanupload"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23866"

RPM_NAME = "texlive-ctanupload-bin-2023.20230311.svn23866-92.1.aarch64.rpm"
RPM_HASH = "1730c712d211b1188d3c55414a5eefafc83a9811913402290cd2769f63e84114e4cd722ae263a0ce7c1002e3476e8c65f2837ca8e8352c423c12b466c2ce583c"

RPROVIDES:${PN} += "texlive-ctanupload-bin"

RDEPENDS:${PN} += "texlive-ctanupload"

inherit rpm

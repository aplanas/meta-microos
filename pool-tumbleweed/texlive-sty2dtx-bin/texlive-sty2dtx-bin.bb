SUMMARY = "Binary files of sty2dtx"
DESCRIPTION = "Binary files of sty2dtx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn21215"

RPM_NAME = "texlive-sty2dtx-bin-2023.20230311.svn21215-93.1.aarch64.rpm"
RPM_HASH = "003c60bbc191575e5412a196f448f89edf9f34113a37f09331346a7cac5202304fa9663773bc660cf36b6a9cde379fa70f5bd049966e93b73d0742cd3d5ce079"

RPROVIDES:${PN} += "texlive-sty2dtx-bin"

RDEPENDS:${PN} += "texlive-sty2dtx"

inherit rpm

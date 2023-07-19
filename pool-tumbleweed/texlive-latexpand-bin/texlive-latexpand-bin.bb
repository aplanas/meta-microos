SUMMARY = "Binary files of latexpand"
DESCRIPTION = "Binary files of latexpand"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn27025"

RPM_NAME = "texlive-latexpand-bin-2023.20230311.svn27025-93.1.aarch64.rpm"
RPM_HASH = "7e5f90dd4a6a9e83eb60dee0ae110b39e855c265bb102d815721a674c12ef44d4ad48abd2311dd88b909a980a6142479d810026f1c047d79b49db2354a70b6e8"

RPROVIDES:${PN} += "texlive-latexpand-bin"

RDEPENDS:${PN} += "texlive-latexpand"

inherit rpm

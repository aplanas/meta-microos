SUMMARY = "Binary files of velthuis"
DESCRIPTION = "Binary files of velthuis"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-velthuis-bin-2023.20230311.svn62210-93.2.aarch64.rpm"
RPM_HASH = "aa1e2c1deea5ce6ffee6ec793265955d3c49e458475d619e26b21b1dcd706ab128262061f981af9c84b44ce51430acb83c127fe78ba531a5adf4c082674da451"

RPROVIDES:${PN} += "texlive-velthuis-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-velthuis"

inherit rpm

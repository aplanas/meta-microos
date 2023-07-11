SUMMARY = "X Window System Display Remote Control"
DESCRIPTION = "x2x allows the keyboard and mouse on one ('from') X Window System \
display to be used to control another ('to') X Window System display."
LICENSE = "GPL-2.0+"

PV = "1.30rc1+git.20180517"

RPM_NAME = "x2x-1.30rc1+git.20180517-1.19.aarch64.rpm"
RPM_HASH = "3e92ebafaadf02582db68ccf0de71c6fedfd4fd475b33a533fcde9af1cf622e078f8c1dd90a7a5b7475197668476e1312f9c6504f5a2660ec64d8e2feb083d46"

RPROVIDES:${PN} += "x2x"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm

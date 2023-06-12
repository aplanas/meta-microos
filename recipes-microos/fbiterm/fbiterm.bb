SUMMARY = "Internationalized Terminal Emulator for Framebuffers"
DESCRIPTION = "An internationalized terminal emulator for framebuffers."
LICENSE = "SUSE-CPL-0.5"

PV = "0.5.20040304"

RPM_NAME = "fbiterm-0.5.20040304-301.9.aarch64.rpm"
RPM_HASH = "84c22139e7d6b455f56d59f590ed81f76cccfa908aada7527d663394e325341d17e4f241869aeb9275887d0af9ca467fe267c01760ae9d2f2ff66e05c3f24229"

RPROVIDES:${PN} += "fbiterm \
fbiterm(aarch-64) \
locale(ja;ko;zh)"
RDEPENDS:${PN} += "group(tty) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libXfont.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libiterm.so.1()(64bit)"

inherit rpm

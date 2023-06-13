SUMMARY = "A termcap implementation"
DESCRIPTION = "An implementation of termcap, i.e. the termcap C functions tgetent, tputs, \
etc., including the parser for the /usr/share/misc/termcap file."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libxtermcap1_0-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "ca9328a16114fed76feefda00526a7699e0c522c2c7a7e7b8703558886ef506ab94ceb929b89c271b2198a2b0bbd117baa969f7e70524e63fa0af6577fed52d1"

RPROVIDES:${PN} += "libxtermcap.so.1.0()(64bit) \
libxtermcap.so.1.0(SCHILY_1.0)(64bit) \
libxtermcap.so.1.0(SCHILY_1.1)(64bit) \
libxtermcap1_0 \
libxtermcap1_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libschily.so.2.0()(64bit) \
libschily.so.2.0(SCHILY_1.0)(64bit) \
libschily.so.2.0(SCHILY_2.0)(64bit)"

inherit rpm

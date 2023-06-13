SUMMARY = "Ditroff Output Displayer for Groff"
DESCRIPTION = "This version of xditview is called gxditview and has some extensions \
used by the groff command.  gxditview is used by groff if called with \
the -X option."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.4"

RPM_NAME = "gxditview-1.22.4-10.3.aarch64.rpm"
RPM_HASH = "7f9fae3f9d3c017bfa39636bdcc13f4fe5bb53790248ea5e7f0929e7dfc82ee6facd76548937dc54d3f901d26d1a176933194b2d6657cd7916fe2719c58ebc57"

RPROVIDES:${PN} += "gxditview \
gxditview(aarch-64) \
gxdview"

RDEPENDS:${PN} += "groff-full \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm

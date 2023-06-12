SUMMARY = "General purpose calculator and mathematics tool"
DESCRIPTION = "Genius is a general purpose calculator program similar in some aspects \
to BC, Matlab, Maple or Mathematica. It is useful both as a simple \
calculator and as a research or educational tool. The syntax \
mimics how mathematics is usually written. \
 \
GEL (Genius Extenseion Language) is the name of its extension language. \
Many of the standard genius functions are written in GEL itself."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.27"

RPM_NAME = "genius-1.0.27-1.9.aarch64.rpm"
RPM_HASH = "51fe2a446c99dbe0c9fe06a65341728d0645057efadece8cef99813a316d47aca6c46df0df5d227ce621069f2eb075978f84b3889a3aef0f8e79e0564befe072"

RPROVIDES:${PN} += "genius \
genius(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmpfr.so.6()(64bit) \
libreadline.so.8()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm

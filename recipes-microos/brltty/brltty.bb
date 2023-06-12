SUMMARY = "Braille display driver for Linux/Unix"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-6.5-2.4.aarch64.rpm"
RPM_HASH = "5cdd0f2b595c381ba6c2b1eb9d0b27188eda7ed91c0eb0c1e87c06393d1f2922481d4ea2de96779fb2d1c7f66c656a245592de551b93b459e1e4001d75c7e4f4"

RPROVIDES:${PN} += "brltty brltty(aarch-64) config(brltty) libbrlttybal.so()(64bit) libbrlttybat.so()(64bit) libbrlttybbc.so()(64bit) libbrlttybbd.so()(64bit) libbrlttybbg.so()(64bit) libbrlttybbl.so()(64bit) libbrlttybbm.so()(64bit) libbrlttybbn.so()(64bit) libbrlttybcb.so()(64bit) libbrlttybce.so()(64bit) libbrlttybcn.so()(64bit) libbrlttybec.so()(64bit) libbrlttybeu.so()(64bit) libbrlttybfa.so()(64bit) libbrlttybfs.so()(64bit) libbrlttybhd.so()(64bit) libbrlttybhm.so()(64bit) libbrlttybht.so()(64bit) libbrlttybhw.so()(64bit) libbrlttybic.so()(64bit) libbrlttybir.so()(64bit) libbrlttyblt.so()(64bit) libbrlttybmb.so()(64bit) libbrlttybmd.so()(64bit) libbrlttybmm.so()(64bit) libbrlttybmn.so()(64bit) libbrlttybmt.so()(64bit) libbrlttybnp.so()(64bit) libbrlttybpg.so()(64bit) libbrlttybpm.so()(64bit) libbrlttybsk.so()(64bit) libbrlttybtn.so()(64bit) libbrlttybts.so()(64bit) libbrlttybtt.so()(64bit) libbrlttybvd.so()(64bit) libbrlttybvo.so()(64bit) libbrlttybvr.so()(64bit) libbrlttybvs.so()(64bit) libbrlttysal.so()(64bit) libbrlttysbl.so()(64bit) libbrlttyscb.so()(64bit) libbrlttysen.so()(64bit) libbrlttysfv.so()(64bit) libbrlttysgs.so()(64bit) libbrlttysxs.so()(64bit) libbrlttyxlx.so()(64bit) libbrlttyxsc.so()(64bit) metainfo() metainfo(org.a11y.brltty.metainfo.xml)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libbluetooth.so.3()(64bit) libbrlapi.so.0.8()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libespeak-ng.so.1()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgpm.so.2()(64bit) libicuuc.so.73()(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libpcre2-32.so.0()(64bit) libpolkit-gobject-1.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) system-user-brltty"

inherit rpm

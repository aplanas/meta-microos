SUMMARY = "Braille display driver for Linux/Unix"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-6.5-2.4.aarch64.rpm"
RPM_HASH = "5cdd0f2b595c381ba6c2b1eb9d0b27188eda7ed91c0eb0c1e87c06393d1f2922481d4ea2de96779fb2d1c7f66c656a245592de551b93b459e1e4001d75c7e4f4"

RPROVIDES:${PN} += "brltty \
config-brltty \
libbrlttybal.so \
libbrlttybat.so \
libbrlttybbc.so \
libbrlttybbd.so \
libbrlttybbg.so \
libbrlttybbl.so \
libbrlttybbm.so \
libbrlttybbn.so \
libbrlttybcb.so \
libbrlttybce.so \
libbrlttybcn.so \
libbrlttybec.so \
libbrlttybeu.so \
libbrlttybfa.so \
libbrlttybfs.so \
libbrlttybhd.so \
libbrlttybhm.so \
libbrlttybht.so \
libbrlttybhw.so \
libbrlttybic.so \
libbrlttybir.so \
libbrlttyblt.so \
libbrlttybmb.so \
libbrlttybmd.so \
libbrlttybmm.so \
libbrlttybmn.so \
libbrlttybmt.so \
libbrlttybnp.so \
libbrlttybpg.so \
libbrlttybpm.so \
libbrlttybsk.so \
libbrlttybtn.so \
libbrlttybts.so \
libbrlttybtt.so \
libbrlttybvd.so \
libbrlttybvo.so \
libbrlttybvr.so \
libbrlttybvs.so \
libbrlttysal.so \
libbrlttysbl.so \
libbrlttyscb.so \
libbrlttysen.so \
libbrlttysfv.so \
libbrlttysgs.so \
libbrlttysxs.so \
libbrlttyxlx.so \
libbrlttyxsc.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libbluetooth.so.3 \
libbrlapi.so.0.8 \
libc.so.6 \
libdbus-1.so.3 \
libespeak-ng.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpm.so.2 \
libicuuc.so.73 \
libncursesw.so.6 \
libpcre2-32.so.0 \
libpolkit-gobject-1.so.0 \
libsystemd.so.0 \
libtinfo.so.6 \
libudev.so.1 \
system-user-brltty"

inherit rpm

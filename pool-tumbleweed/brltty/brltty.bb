SUMMARY = "Braille display driver for Linux/Unix"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "brltty-6.6-1.1.aarch64.rpm"
RPM_HASH = "386d2302638a7ce155e19d815deb94dcf3031b59100c6d48427922bfb32931a43776fd6858fc344b6800a77ae116a989d1aab46a4d84c662029ad0c32ac10d6a"

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
libbrlttybdp.so \
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
libbrlttyxem.so \
libbrlttyxfv.so \
libbrlttyxlx.so \
libbrlttyxsc.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
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

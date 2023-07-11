SUMMARY = "Plee the Bear, a 2D platform game"
DESCRIPTION = "Plee the Bear is a 2D platform game like those found on consoles in \
the beginning of the 1990s. The storyline centeres around an angry \
bear whose son has been kidnapped by God."
LICENSE = "GPL-3.0-only"

PV = "0.7.1"

RPM_NAME = "plee-the-bear-0.7.1-2.24.aarch64.rpm"
RPM_HASH = "49ed67c0f4cb11121d8cdb909810557ed1b4b1484cb7d67fd88701dbdf749ac0156ed3a49d1dc81fd903762f1d49f550aa34d2d4cb21ca84f76a9ec017d7e5ea"

RPROVIDES:${PN} += "libbear-audio.so \
libbear-communication.so \
libbear-debug.so \
libbear-engine.so \
libbear-expr.so \
libbear-generic-items.so \
libbear-gui.so \
libbear-input.so \
libbear-net.so \
libbear-text-interface.so \
libbear-time.so \
libbear-universe.so \
libbear-visual.so \
libplee-the-bear.so \
plee-the-bear"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libboost-filesystem.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libclaw-application.so.1 \
libclaw-configuration-file.so.1 \
libclaw-dynamic-library.so.1 \
libclaw-graphic.so.1 \
libclaw-logger.so.1 \
libclaw-net.so.1 \
libclaw-tween.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

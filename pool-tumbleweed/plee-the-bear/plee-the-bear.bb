SUMMARY = "Plee the Bear, a 2D platform game"
DESCRIPTION = "Plee the Bear is a 2D platform game like those found on consoles in \
the beginning of the 1990s. The storyline centeres around an angry \
bear whose son has been kidnapped by God."
LICENSE = "GPL-3.0-only"

PV = "0.7.1"

RPM_NAME = "plee-the-bear-0.7.1-2.23.aarch64.rpm"
RPM_HASH = "27a2f19de44beb6fbbd2213d48f3c66c8c615ffac27682b53a8215d8c10b8484da5b222f1a6e88a5ac4f13d5e32fb676e343987c28ac863ade44e1dca5618d5d"

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

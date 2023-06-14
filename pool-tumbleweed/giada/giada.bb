SUMMARY = "Sampler Audio Tool"
DESCRIPTION = "Giada is an audio tool for DJs and live performers. Up to 32 samples \
may be loaded or recorded, and may be played in single mode (drum \
machine) or loop mode (sequencer). The keyboard can be used to \
control this."
LICENSE = "GPL-3.0-or-later"

PV = "0.24.0"

RPM_NAME = "giada-0.24.0-1.1.aarch64.rpm"
RPM_HASH = "5d7df2ebecdd169c4c9a66910b85085ec93d88d3496d8caa2c108543a6cbf0421023f9c7523b19f29981eee845381b7a70d31362f09ad8c08218b04227137d92"

RPROVIDES:${PN} += "giada"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXfixes.so.3 \
libXft.so.2 \
libXinerama.so.1 \
libXrender.so.1 \
libasound.so.2 \
libc.so.6 \
libfmt.so.9 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
librtmidi.so.6 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Sampler Audio Tool"
DESCRIPTION = "Giada is an audio tool for DJs and live performers. Up to 32 samples \
may be loaded or recorded, and may be played in single mode (drum \
machine) or loop mode (sequencer). The keyboard can be used to \
control this."
LICENSE = "GPL-3.0-or-later"

PV = "0.24.0"

RPM_NAME = "giada-0.24.0-1.1.aarch64.rpm"
RPM_HASH = "5d7df2ebecdd169c4c9a66910b85085ec93d88d3496d8caa2c108543a6cbf0421023f9c7523b19f29981eee845381b7a70d31362f09ad8c08218b04227137d92"

RPROVIDES:${PN} += "application() \
application(com.giadamusic.Giada.desktop) \
application(giada.desktop) \
giada \
giada(aarch-64) \
metainfo() \
metainfo(com.giadamusic.Giada.metainfo.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXfixes.so.3()(64bit) \
libXft.so.2()(64bit) \
libXinerama.so.1()(64bit) \
libXrender.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libfmt.so.9()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
librtmidi.so.6()(64bit) \
libsamplerate.so.0()(64bit) \
libsndfile.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

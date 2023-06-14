SUMMARY = "Extra plugins for Audacious"
DESCRIPTION = "Extra plugins for the Audacious audio player."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & MIT"

PV = "4.3"

RPM_NAME = "audacious-plugins-extra-4.3-1.4.aarch64.rpm"
RPM_HASH = "9419eff2005362acb05a311934e55763b056c20c72d942a3f1cf3be9688aaddbe122c4343056d06213724a12ac83d3a3feb72582f6c12b0c98a5100d53728ea1"

RPROVIDES:${PN} += "audacious-plugins-extra"

RDEPENDS:${PN} += "audacious-plugins \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libaudcore.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libmp3lame.so.0 \
libogg.so.0 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2"

inherit rpm

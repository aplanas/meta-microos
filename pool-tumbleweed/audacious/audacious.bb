SUMMARY = "Audio player with graphical UI and library functionality"
DESCRIPTION = "Audacious is an audio player. It is based on Qt and supports a wide \
range of audio codecs. It still features an alternative skinned user \
interface (based on Winamp 2.x skins). Historically, it started as a \
fork of a fork of XMMS."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "audacious-4.3.1-2.1.aarch64.rpm"
RPM_HASH = "01ff2949e9c70249fc4a3545275d0b827dbf404a613de54e14d11d0a7dc9c7ebf04f1fd4383155f7321eb80f9cde669f541a9f31b4465a5d16ed1c4dfb2fab9c"

RPROVIDES:${PN} += "audacious"

RDEPENDS:${PN} += "audacious-plugins \
cmake-Qt6Svg \
ld-linux-aarch64.so.1 \
libaudcore.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Audio player with graphical UI and library functionality"
DESCRIPTION = "Audacious is an audio player. It is based on Qt and supports a wide \
range of audio codecs. It still features an alternative skinned user \
interface (based on Winamp 2.x skins). Historically, it started as a \
fork of a fork of XMMS."
LICENSE = "BSD-2-Clause"

PV = "4.3"

RPM_NAME = "audacious-4.3-1.3.aarch64.rpm"
RPM_HASH = "efd1972c6c087c23c81143b24767d88601baf33540f3113e04925964e2afef592326bd3ecf9e91cc6e90d67a7482914e62f1a2b01c972c1671f1b619da8f8834"

RPROVIDES:${PN} += "audacious"

RDEPENDS:${PN} += "audacious-plugins \
ld-linux-aarch64.so.1 \
libaudcore.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm

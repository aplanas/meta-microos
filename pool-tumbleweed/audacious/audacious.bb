SUMMARY = "Audio player with graphical UI and library functionality"
DESCRIPTION = "Audacious is an audio player. It is based on Qt and supports a wide \
range of audio codecs. It still features an alternative skinned user \
interface (based on Winamp 2.x skins). Historically, it started as a \
fork of a fork of XMMS."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "audacious-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "6670f049ba66cd2a2db28bd130a14b91e201ccfc8f179f2415683c540356ece31001bf110592596b9c72622f18c889ce4a636b408b38a5b605ab156f701e1754"

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

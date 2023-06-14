SUMMARY = "Virtual Pipe Organ Software"
DESCRIPTION = "GrandOrgue is a virtual pipe organ sample player application supporting a HW1 compatible file format."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.0"

RPM_NAME = "grandorgue-3.12.0-1.1.aarch64.rpm"
RPM_HASH = "a22ae18ecdfdb684db9267d4db37605a4d629fd373aa6b6103ed16d387adfde413548ed8f2c2151ab6ed0133fc584ea0defc3699920ed5b5375bc43370685beb"

RPROVIDES:${PN} += "grandorgue \
libGrandOrgueCore.so.3.11.3 \
libGrandOrgueImages.so.3.11.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libportaudio.so.2 \
librtaudio.so.6 \
librtmidi.so.6 \
libstdc++.so.6 \
libwavpack.so.1 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-html-suse.so.9.0.0 \
libyaml-cpp.so.0.7 \
libz.so.1 \
libzita-convolver.so.4"

inherit rpm

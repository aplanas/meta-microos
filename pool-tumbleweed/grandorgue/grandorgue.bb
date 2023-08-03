SUMMARY = "Virtual Pipe Organ Software"
DESCRIPTION = "GrandOrgue is a virtual pipe organ sample player application supporting a HW1 compatible file format."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "grandorgue-3.12.2-1.1.aarch64.rpm"
RPM_HASH = "0a283758005f1183918b9ce0b44cd67b2f59774c7399e763b90d5771ff9dad0d476b4e293b0acbfccba408f11c9e2942f959b0c6940ee5b92cf080fe64e684ea"

RPROVIDES:${PN} += "grandorgue \
libGrandOrgueCore.so.3.12.2 \
libGrandOrgueImages.so.3.12.2"

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

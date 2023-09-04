SUMMARY = "Virtual Pipe Organ Software"
DESCRIPTION = "GrandOrgue is a virtual pipe organ sample player application supporting a HW1 compatible file format."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "grandorgue-3.12.2-1.2.aarch64.rpm"
RPM_HASH = "c34640322572421ac1760d86e8056093312e118b146bd976ef335a3132c87d10c9fb24f38e21f587e51290961872c60d66f64a211a751d805cc8fd71b95af90a"

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
libyaml-cpp.so.0.8 \
libz.so.1 \
libzita-convolver.so.4"

inherit rpm

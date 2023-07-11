SUMMARY = "Virtual Pipe Organ Software"
DESCRIPTION = "GrandOrgue is a virtual pipe organ sample player application supporting a HW1 compatible file format."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.1"

RPM_NAME = "grandorgue-3.12.1-1.1.aarch64.rpm"
RPM_HASH = "0b045dd05291d10fb19cdb10db8c1cc23c038778bf5c0b85ff3558c8cc44c08d4445b656a83640b577b9a15b15d30e74c9f4ad4a84734b14d0cb919317bce81f"

RPROVIDES:${PN} += "grandorgue \
libGrandOrgueCore.so.3.12.1 \
libGrandOrgueImages.so.3.12.1"

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

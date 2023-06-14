SUMMARY = "AVC plugin for ptlib"
DESCRIPTION = "This plugin enables AVC (firewire control for digital video cameras) \
support in ptlib."
LICENSE = "MPL-1.0"

PV = "2.18.8"

RPM_NAME = "libpt2_18_8-plugins-avc-2.18.8-1.5.aarch64.rpm"
RPM_HASH = "c82cdfd8889397a64a235ff411a8f7ce84962adfa23747d812464f8addbe410a2401a15d1f88083661a329c60a32ec0c5bfb315b9a911ec5e2089049ffeba2b0"

RPROVIDES:${PN} += "libpt2-18-8-plugins-avc \
libpt2-plugins-avc \
libpt2-video-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdv.so.4 \
libgcc-s.so.1 \
libpt.so.2.18.8 \
libpt2-18-8 \
libraw1394.so.11 \
librom1394.so.0 \
libstdc++.so.6"

inherit rpm

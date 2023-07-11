SUMMARY = "AVC plugin for ptlib"
DESCRIPTION = "This plugin enables AVC (firewire control for digital video cameras) \
support in ptlib."
LICENSE = "MPL-1.0"

PV = "2.18.8"

RPM_NAME = "libpt2_18_8-plugins-avc-2.18.8-1.7.aarch64.rpm"
RPM_HASH = "5ff4262bf4c601ad63142dfa74c3ee9365da03ce62ca1f837330085cc4b0cd6f3d9a713be11bd63dea3224be772be25dbf183989767e830ef9f7f3f925b574b2"

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

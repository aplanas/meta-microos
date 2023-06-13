SUMMARY = "Emu10k1 patch loader for ALSA"
DESCRIPTION = "This package contains the patch loader program for Emu10k1 and Emu10k1 on ALSA."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.8p1"

RPM_NAME = "ld10k1-0.1.8p1-24.3.aarch64.rpm"
RPM_HASH = "d2ce8ad90c03fc05e6a8fd9291edd1748263cd576e5788b4982f0b197a259e9a0678b07b2b7633cddedb35ac3eecfc858b92398f620f0f2ba8546caa04813913"

RPROVIDES:${PN} += "alsa-tools:/usr/bin/lo10k1 \
ld10k1 \
ld10k1(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblo10k1.so.0()(64bit)"

inherit rpm

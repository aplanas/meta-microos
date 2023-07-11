SUMMARY = "Perceptual video quality assessment algorithm"
DESCRIPTION = "VMAF is a perceptual video quality assessment algorithm."
LICENSE = "BSD-2-Clause-Patent & BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "libvmaf1-2.3.1-3.3.aarch64.rpm"
RPM_HASH = "736e831bab77a2e0e1e1b8d92fb41ad0bacb0e7a77603624bb11bbf48cd131ea7b97bbff0a4676100e803b0872e4a142de74c7996c332f236ac97b256d09819e"

RPROVIDES:${PN} += "libvmaf.so.1 \
libvmaf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "APE codec and decompressor"
DESCRIPTION = "Monkey’s Audio is a fast and easy way to compress digital music."
LICENSE = "SUSE-Permissive"

PV = "8.92"

RPM_NAME = "mac-8.92-1.2.aarch64.rpm"
RPM_HASH = "bd2347c2f6adbbd7428847b3f92d3f38a68f8c3ebc5f56c3b5eb180f66a42ff75f739004a5c3a54dc2a3f64140248f8bae1331225f391a96ee41752891647882"

RPROVIDES:${PN} += "libMAC.so.8()(64bit) \
mac \
mac(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm

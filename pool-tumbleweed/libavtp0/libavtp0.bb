SUMMARY = "Audio Video Transport Protocol (AVTP) Support Library"
DESCRIPTION = "An implementation of Audio Video Transport Protocol (AVTP) as specified \
in IEEE 1722-2016."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "libavtp0-0.2.0-2.1.aarch64.rpm"
RPM_HASH = "0661979450ed3a2f7718250ae43218bb67a3b2c462fea2a9744e3be8ffa4847a23a74c81eaaa1226edb85b1465ba72b91e434a0ec65d2874888f92cb8833b019"

RPROVIDES:${PN} += "libavtp.so.0 \
libavtp0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm

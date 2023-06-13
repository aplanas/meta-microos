SUMMARY = "Blind-ID library"
DESCRIPTION = "Blind-ID library for user identification using RSA blind signatures"
LICENSE = "BSD-3-Clause"

PV = "0.8.5"

RPM_NAME = "d0_blind_id-0.8.5-1.1.aarch64.rpm"
RPM_HASH = "ec2802fe1b1ae3bc04f5af6f79e7ce4de6c0153857fe4e50c8bbcdfe161a359331c4901d19ccf81ef61752ad7d307759cabdcea8268260718d895621cfab57b4"

RPROVIDES:${PN} += "d0_blind_id \
d0_blind_id(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libd0_blind_id.so.0()(64bit)"

inherit rpm

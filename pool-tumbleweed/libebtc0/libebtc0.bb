SUMMARY = "Library for the ebtables low-level ruleset generation and parsing"
DESCRIPTION = "libebtc ('ebtables cache') is used to retrieve from the kernel, parse, \
construct, and load rulesets into the kernel."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.11"

RPM_NAME = "libebtc0-2.0.11-5.7.aarch64.rpm"
RPM_HASH = "6c52fee11ad5a1a4108606be82437fb0f7018c434d19a7785adca2aa1eded02835852dcfa71c25f376df45c900e20600bc3cc86b6405cc126750ea1daeafe9e7"

RPROVIDES:${PN} += "libebtc.so.0()(64bit) \
libebtc0 \
libebtc0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm

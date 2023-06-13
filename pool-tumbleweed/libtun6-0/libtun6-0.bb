SUMMARY = "Linux tunnel configuration library used by miredo"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). \
This package contains a library that takes care of configuring \
Linux tunnel interfaces."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "libtun6-0-1.2.6-5.7.aarch64.rpm"
RPM_HASH = "1a0c6cc0df75619d23a03073668b364edd8a518aacd69d21b08a36f68b09cb2b6e97a360df027aea334bf5edfe37a57d212bad43eb4ea6a396c318bc356ee3d4"

RPROVIDES:${PN} += "libtun6-0 \
libtun6-0(aarch-64) \
libtun6.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm

SUMMARY = "WireGuard interface for mitmproxy"
DESCRIPTION = "Transparently proxy any device that can be configured as a WireGuard client!"
LICENSE = "MIT"

PV = "0.1.23"

RPM_NAME = "python311-mitmproxy-wireguard-0.1.23-1.1.aarch64.rpm"
RPM_HASH = "5e25171b78646e6fa030ec8fa81382bf4faab699c7af6a0872cafa0b414f5b54dda41b7c0d7e69b8499457cabbbcc7b750dcecf105cc57bf2481c461a03b495e"

RPROVIDES:${PN} += "python3.11dist(mitmproxy-wireguard) \
python311-mitmproxy-wireguard \
python311-mitmproxy-wireguard(aarch-64) \
python3dist(mitmproxy-wireguard)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
python(abi) \
python311"

inherit rpm

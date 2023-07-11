SUMMARY = "WireGuard interface for mitmproxy"
DESCRIPTION = "Transparently proxy any device that can be configured as a WireGuard client!"
LICENSE = "MIT"

PV = "0.1.23"

RPM_NAME = "python310-mitmproxy-wireguard-0.1.23-1.4.aarch64.rpm"
RPM_HASH = "c178c60fc2d674a9275295016e53203a558dd05c9413fb3dbdbcdf1e65ae216a4663a48db47d6a81f7f459473f3778e2e3cb3b33b515b966bc185952a6e94670"

RPROVIDES:${PN} += "python3.10dist-mitmproxy-wireguard \
python310-mitmproxy-wireguard \
python3dist-mitmproxy-wireguard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python310"

inherit rpm

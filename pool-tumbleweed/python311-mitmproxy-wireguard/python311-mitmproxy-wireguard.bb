SUMMARY = "WireGuard interface for mitmproxy"
DESCRIPTION = "Transparently proxy any device that can be configured as a WireGuard client!"
LICENSE = "MIT"

PV = "0.1.23"

RPM_NAME = "python311-mitmproxy-wireguard-0.1.23-1.4.aarch64.rpm"
RPM_HASH = "df2f0c48c10a3459325d05f7bab9627539a7bb60d6af9e8a6c8d1a09112f8e2a0c31319722b307d3120761f346723a9c346ee06129debbd82851387d1ec645c5"

RPROVIDES:${PN} += "python3-mitmproxy-wireguard \
python3.11dist-mitmproxy-wireguard \
python311-mitmproxy-wireguard \
python3dist-mitmproxy-wireguard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python311"

inherit rpm

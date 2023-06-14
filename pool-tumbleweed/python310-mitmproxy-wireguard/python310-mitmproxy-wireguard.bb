SUMMARY = "WireGuard interface for mitmproxy"
DESCRIPTION = "Transparently proxy any device that can be configured as a WireGuard client!"
LICENSE = "MIT"

PV = "0.1.23"

RPM_NAME = "python310-mitmproxy-wireguard-0.1.23-1.1.aarch64.rpm"
RPM_HASH = "c8c3e82cd15a8ca3e6d5f05a03b66faabfbacf040c5750b1556d8dbea19940e94b571039fcb1db6121c54aa644b1b2da44289acb957951513f9777f9759c77ff"

RPROVIDES:${PN} += "python3-mitmproxy-wireguard \
python3.10dist-mitmproxy-wireguard \
python310-mitmproxy-wireguard \
python3dist-mitmproxy-wireguard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python310"

inherit rpm

SUMMARY = "WireGuard interface for mitmproxy"
DESCRIPTION = "Transparently proxy any device that can be configured as a WireGuard client!"
LICENSE = "MIT"

PV = "0.1.23"

RPM_NAME = "python39-mitmproxy-wireguard-0.1.23-1.4.aarch64.rpm"
RPM_HASH = "d11a5069243850c20f9e444300ea212d4c3dd575061646068691a129f67244b89692ee856db6bc9693fc34e60c4d1c45f64ca631d871d54ec2b548dfe72954a4"

RPROVIDES:${PN} += "python3.9dist-mitmproxy-wireguard \
python39-mitmproxy-wireguard \
python3dist-mitmproxy-wireguard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python39"

inherit rpm

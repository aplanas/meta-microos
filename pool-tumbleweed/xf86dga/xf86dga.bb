SUMMARY = "Test program for the XFree86-DGA extension"
DESCRIPTION = "dga is a simple test client for the XFree86-DGA extension."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "xf86dga-1.0.3-9.26.aarch64.rpm"
RPM_HASH = "5253d882020d62bb6b34425ebc7005e3a63ca6663ff4c26c5e0147ec7770381c963e2ba9e28fd13545ed80f23fa14aa1782c8dd0875f6e2f8b1d2d813aa8914d"

RPROVIDES:${PN} += "xf86dga"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86dga.so.1 \
libc.so.6"

inherit rpm

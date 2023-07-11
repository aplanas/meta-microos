SUMMARY = "Test program for the XFree86-DGA extension"
DESCRIPTION = "dga is a simple test client for the XFree86-DGA extension."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "xf86dga-1.0.3-9.27.aarch64.rpm"
RPM_HASH = "edae057220e2ae1aada8bcf07f1a5fa8138eccaed15a2912081e9e99e97c1884a9147ea4a11f25b15b6c8bff48fd7b87ecdec3cd099b14d529c6ec8adeb16488"

RPROVIDES:${PN} += "xf86dga"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86dga.so.1 \
libc.so.6"

inherit rpm

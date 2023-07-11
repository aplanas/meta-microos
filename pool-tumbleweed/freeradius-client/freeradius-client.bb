SUMMARY = "FreeRADIUS Client Software"
DESCRIPTION = "A portable, easy-to-use and standard compliant library suitable for \
developing free and commercial software that need support for a RADIUS \
protocol (RFCs 2128 and 2139)."
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "freeradius-client-1.1.7-1.31.aarch64.rpm"
RPM_HASH = "e6d4bc0f96252e813d49fbb37079a170c07d36451170f7d1bd38c3498e402e006b8b5dac0e383296c5f6cd4ccc74cc4058fb24bdd9c05111a6f8d27a5ef7ce7f"

RPROVIDES:${PN} += "config-freeradius-client \
freeradius-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libfreeradius-client.so.2"

inherit rpm

SUMMARY = "Simple round analog clock"
DESCRIPTION = "oclock is a simple analog clock using the SHAPE extension to make \
a round (possibly transparent) window."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "oclock-1.0.5-1.3.aarch64.rpm"
RPM_HASH = "168d6cec74a908309c7ea8eb05a492a2ac72e0bf48fee1cdc38ffd1ff596694e866e01282e4a13f78aaf3c088b3e3c4cd9f80c6a596e7357e06613cc24a2ac54"

RPROVIDES:${PN} += "oclock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libxkbfile.so.1"

inherit rpm

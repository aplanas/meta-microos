SUMMARY = "Shared libraries for qpdf"
DESCRIPTION = "This packages contains the shared libraries required for the qpdf \
package."
LICENSE = "Apache-2.0"

PV = "11.3.0"

RPM_NAME = "libqpdf29-11.3.0-1.3.aarch64.rpm"
RPM_HASH = "f582b384e2e776ee25b8fed7350354e32955274c833d0f0207d998fee16e9560273b1361028dc22b8304ba09b2db58cb5aa42b1b737a4579ca767c7a4873062c"

RPROVIDES:${PN} += "libqpdf.so.29 \
libqpdf29"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libjpeg.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

SUMMARY = "Shared libraries for qpdf"
DESCRIPTION = "This packages contains the shared libraries required for the qpdf \
package."
LICENSE = "Apache-2.0"

PV = "11.3.0"

RPM_NAME = "libqpdf29-11.3.0-1.3.aarch64.rpm"
RPM_HASH = "f582b384e2e776ee25b8fed7350354e32955274c833d0f0207d998fee16e9560273b1361028dc22b8304ba09b2db58cb5aa42b1b737a4579ca767c7a4873062c"

RPROVIDES:${PN} += "libqpdf.so.29()(64bit) \
libqpdf.so.29(LIBQPDF_29)(64bit) \
libqpdf29 \
libqpdf29(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libjpeg.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm

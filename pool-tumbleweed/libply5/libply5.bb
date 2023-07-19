SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply library used by Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply5-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "c82c918ea20948486308d4f3d4bb86d3e0fc1a632c2e8b4ef694d1d516f4e0ffb2cd562f78430d1fc09e816076c0940375425531c6906e2b698293b33e7433b2"

RPROVIDES:${PN} += "libply.so.5 \
libply5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

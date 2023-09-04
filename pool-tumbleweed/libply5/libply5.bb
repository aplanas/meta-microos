SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply library used by Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply5-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "e2eb945a8a0295918b16ef26ab5400dd8e33171f965fb9879e039bd6c4677cdbaf7376dc28a94e4cf0530bf385c29ac9fddb71460d9dcb36c60caf4419b1e509"

RPROVIDES:${PN} += "libply.so.5 \
libply5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

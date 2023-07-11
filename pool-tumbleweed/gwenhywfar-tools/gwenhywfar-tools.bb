SUMMARY = "Tools for the gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "gwenhywfar-tools-5.10.1-1.5.aarch64.rpm"
RPM_HASH = "f6034c20ae5944e7f57f63611b004d9c824f0546873538ee9fd439b9e277ee3a7f06d66126f6e96e9fb12d05f1ca766174e81628f5b6b307f0d5e483ace2c9d7"

RPROVIDES:${PN} += "gwenhywfar-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgwenhywfar.so.79 \
libgwenhywfar79 \
libssl.so.3"

inherit rpm

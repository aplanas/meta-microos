SUMMARY = "Library to manage UEFI variables"
DESCRIPTION = "Library to allow for the simple manipulation of UEFI variables."
LICENSE = "LGPL-2.1-only"

PV = "38"

RPM_NAME = "libefivar1-38-1.4.aarch64.rpm"
RPM_HASH = "5e5774d339d6a0b3806e1591f2fe946dc5bbd0fea03de13de1687238aa10979bd91ac2d7f36e6e90f460994e161e2dfe9d3adde4bdec58430a9329dc677ccce5"

RPROVIDES:${PN} += "libefiboot.so.1 \
libefisec.so.1 \
libefivar.so.1 \
libefivar1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

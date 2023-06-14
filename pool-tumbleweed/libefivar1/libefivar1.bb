SUMMARY = "Library to manage UEFI variables"
DESCRIPTION = "Library to allow for the simple manipulation of UEFI variables."
LICENSE = "LGPL-2.1-only"

PV = "38"

RPM_NAME = "libefivar1-38-1.3.aarch64.rpm"
RPM_HASH = "0c191b7a6caa5d17a28528fd647697ea27be7e1292fb59fc6656bcf9304c97d3ee01040163acf9785357b58fec944701d6cc00e194b651f3049473b74bf7b9cf"

RPROVIDES:${PN} += "libefiboot.so.1 \
libefisec.so.1 \
libefivar.so.1 \
libefivar1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

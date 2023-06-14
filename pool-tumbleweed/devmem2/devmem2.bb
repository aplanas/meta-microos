SUMMARY = "Simple program to read/write from/to any location in memory"
DESCRIPTION = "Simple program to read/write from/to any location in memory. \
Usage examples: \
devmem2 0x48004B48 w 0x2 - write value 0x2 to addr 0x48004B48 \
devmem2 0x50000014 - read value from addr 0x50000014"
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "devmem2-1.0-11.22.aarch64.rpm"
RPM_HASH = "853223979c34bb8b8501c5be05a76bcb063315d2c18086eef898b04ef8e307de4e0a0c1c662db39b5969188fda4df37c2ebf0be3c3100e784f678074ab23563f"

RPROVIDES:${PN} += "devmem2"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

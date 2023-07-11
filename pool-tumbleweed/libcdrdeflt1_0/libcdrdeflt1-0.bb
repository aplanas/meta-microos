SUMMARY = "Library to parse the cdrecord config file"
DESCRIPTION = "This library implements a mechanism to read the settings from \
cdrecord's config file(s)."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "libcdrdeflt1_0-3.02~a10-47.4.aarch64.rpm"
RPM_HASH = "6f52d122fc563474359caf702f526dc822da4113712df91b30a1288fde0d4b0c86200ebf22732092efa147b79867ed9c80b08dc795037a33d85a4397747d93ed"

RPROVIDES:${PN} += "libcdrdeflt.so.1.0 \
libcdrdeflt1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdeflt.so.1.0 \
libschily.so.2.0"

inherit rpm

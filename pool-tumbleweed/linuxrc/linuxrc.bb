SUMMARY = "SUSE Installation Program"
DESCRIPTION = "SUSE installation program."
LICENSE = "GPL-3.0+"

PV = "9.0"

RPM_NAME = "linuxrc-9.0-1.1.aarch64.rpm"
RPM_HASH = "873271dc8902d9c90dee9d16c455a0f143b916b8f357cfeccc95b08f3cff55048e4bf082964ae8f4cf369b112c8c33942ae722f22ccca4e6fb978eaec8eba78d"

RPROVIDES:${PN} += "linuxrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcurl.so.4 \
libhd.so.23 \
libmediacheck.so.6 \
libreadline.so.8"

inherit rpm

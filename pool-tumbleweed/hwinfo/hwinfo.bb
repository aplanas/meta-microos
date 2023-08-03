SUMMARY = "Hardware Library"
DESCRIPTION = "A program that lists results from the hardware detection \
library."
LICENSE = "GPL-2.0-or-later"

PV = "23.2"

RPM_NAME = "hwinfo-23.2-1.1.aarch64.rpm"
RPM_HASH = "1ebd56859accb19403da32e3f59909b3ab99608df4fb715abc6ab3d4837d02c9599a23867745ad7a48ca9817a57805492b91225dbe4d46afdb39c080a84cf620"

RPROVIDES:${PN} += "hwinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhd.so.23"

inherit rpm

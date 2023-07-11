SUMMARY = "USB interface library for J-Link"
DESCRIPTION = "Library for accessing Segger J-Link USB devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "libjaylink-0.3.1-1.3.aarch64.rpm"
RPM_HASH = "1d5587260fd29efdc5cc45def89c33f6d7df6bb0bfa8df3474fb5a885e5ddd5a4cf1f694ca595776a70ebe53bac6fc767779a0e1428a6ce0e46c476a5d2c0fcb"

RPROVIDES:${PN} += "libjaylink \
libjaylink0-/usr/lib/udev/rules.d/99-libjaylink.rules"

RDEPENDS:${PN} += "/usr/bin/sh \
udev"

inherit rpm

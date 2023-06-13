SUMMARY = "IP address range management tool for FireHOL"
DESCRIPTION = "This tool manages IP address ranges for FireHOL."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.4"

RPM_NAME = "iprange-1.0.4-2.15.aarch64.rpm"
RPM_HASH = "ece60ffba29402335c697fc44f599b535352a72dca6a2c11a150a17fc12c46eab8bbe8eb16fe64e753fe36fdac1be9969262a04a4aa0e80a0fd946521b6c5585"

RPROVIDES:${PN} += "iprange \
iprange(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm

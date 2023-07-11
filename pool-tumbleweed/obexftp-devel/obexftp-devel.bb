SUMMARY = "Development package for obexftp"
DESCRIPTION = "Files needed for software development using obexftp."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "obexftp-devel-0.24.2-1.24.aarch64.rpm"
RPM_HASH = "de7d073f4e7d5c642af7b1e2e56666c1d4c8aec99d482adc450cd3afa4f954bedad2b8524dcc3930c5bfcba047438a5e877f28e6d0b664478878dd073880dd54"

RPROVIDES:${PN} += "obexftp-devel \
pkgconfig-obexftp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
obexftp \
openobex-devel \
pkgconfig-bluez \
pkgconfig-openobex"

inherit rpm

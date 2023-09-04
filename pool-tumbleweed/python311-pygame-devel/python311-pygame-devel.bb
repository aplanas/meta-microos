SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "python311-pygame-devel-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "763b475595b2d0661000db3ebca1a0eab0365d5d7a2ee2eec4fe4cd68e1bda8217f1e9f14d09987b7aa15b6541bd234099f8d2f83f8d9d367791a5ecd38fe30b"

RPROVIDES:${PN} += "python3-pygame-devel \
python311-pygame-devel"

RDEPENDS:${PN} += "python311-pygame"

inherit rpm

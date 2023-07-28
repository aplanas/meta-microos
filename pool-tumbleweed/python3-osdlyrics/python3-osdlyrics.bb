SUMMARY = "Python module for osdlyrics"
DESCRIPTION = "This package contains python3 module for osdlyrics"
LICENSE = "GPL-3.0-or-later"

PV = "0.5.14"

RPM_NAME = "python3-osdlyrics-0.5.14-1.1.aarch64.rpm"
RPM_HASH = "15461df8d9e043026d0bb0674e219a0586edadda8f07523c5d1b2798c1711cba9c94e80a4660eeb063939ef6b00aac30f8b0c3ca5e5dca4f37d0d48f97cfd2d2"

RPROVIDES:${PN} += "python3-osdlyrics"

RDEPENDS:${PN} += "osdlyrics \
python-abi"

inherit rpm

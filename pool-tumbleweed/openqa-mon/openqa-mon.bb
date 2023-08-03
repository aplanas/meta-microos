SUMMARY = "CLI monitoring utility for openQA"
DESCRIPTION = "openqa-mon is a CLI monitoring client for openqa written in plain go."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "openqa-mon-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "ba68e1ee69406b94d751a82c909b9ad2a8e26805738f5c2f4e4795c61689b4240db3c3ba4a1ce14e3597f1a04787c58abcffeed3cea270085981b79b31d0c641"

RPROVIDES:${PN} += "openqa-mon"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm

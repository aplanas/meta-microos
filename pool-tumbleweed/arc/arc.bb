SUMMARY = "Archiving tool for arc achives"
DESCRIPTION = "This package allows you to unpack *.arc file"
LICENSE = "GPL-2.0-only"

PV = "5.21q"

RPM_NAME = "arc-5.21q-6.11.aarch64.rpm"
RPM_HASH = "3fd7cc4d784caea2a3144bbe152aee767ee4a53eff8cb75079428b6f1ff31d55ead7f657fb95b0de9f8b4373143f87f336f6228542f221c5ba82adea4858cf78"

RPROVIDES:${PN} += "arc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

SUMMARY = "A dynamic library bundling a Linux kernel in a convenient storage format"
DESCRIPTION = " \
libkrunfw is a library bundling a Linux kernel in a dynamic library \
in a way that can be easily consumed by libkrun. \
By having the kernel bundled in a dynamic library, libkrun can leave to \
the linker the work of mapping the sections into the process, and then \
directly inject those mappings into the guest without any kind of additional \
work nor processing."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.8.1"

RPM_NAME = "libkrunfw3-3.8.1-1.6.aarch64.rpm"
RPM_HASH = "6ff9148b04b5f297d6a41f2212a6e8b826d024dc0b005bfae02ae27ff0abb0b9c9dd1b262410695b83fd8e48aae5b6dcf74aca5dd7e80a3938a2844c384d97bc"

RPROVIDES:${PN} += "libkrunfw.so.3 \
libkrunfw3"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm

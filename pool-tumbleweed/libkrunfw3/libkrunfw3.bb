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

RPM_NAME = "libkrunfw3-3.8.1-1.4.aarch64.rpm"
RPM_HASH = "c96649b0159f9732cc0090bcbd448410c05ff44a41692dea4f868b0771fc6e943db3698f91d9c98c12e24b5ca5da1789758ce6360c91cf5e9260175d01bd0d7a"

RPROVIDES:${PN} += "libkrunfw.so.3 \
libkrunfw3"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm

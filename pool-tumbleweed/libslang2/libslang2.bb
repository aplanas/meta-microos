SUMMARY = "Programming Library and Embeddable Extension Language"
DESCRIPTION = "S-Lang is a programming library for creating multi-platform software. \
It provides display/screen management, keyboard input, keymaps, etc. \
Another feature is the interpreter for the S-Lang extension language \
which can be embedded into an application to make it extensible. With \
slsh, a standalone interpreter is available as well."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.3"

RPM_NAME = "libslang2-2.3.3-1.4.aarch64.rpm"
RPM_HASH = "79e341ab380b9e709d206191d99fd5e4f23447f682041b606213d5b566f628fdafb5947015b8e83b918999b49ed83eb03ddb5e378f2d1f621bcc51389f9b1205"

RPROVIDES:${PN} += "libslang.so.2 \
libslang2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

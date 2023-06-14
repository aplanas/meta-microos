SUMMARY = "Programming Library and Embeddable Extension Language"
DESCRIPTION = "S-Lang is a programming library for creating multi-platform software. \
It provides display/screen management, keyboard input, keymaps, etc. \
Another feature is the interpreter for the S-Lang extension language \
which can be embedded into an application to make it extensible. With \
slsh, a standalone interpreter is available as well."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.3"

RPM_NAME = "libslang2-2.3.3-1.3.aarch64.rpm"
RPM_HASH = "a8032b6a1b7f8aee329d442a76a2dcdc23d343582856cb8af8f616b1cfaf317537373ecc3e0aef2caa132b5bc2d6882506cfc5fbb37be5dc75abba2d5216647a"

RPROVIDES:${PN} += "libslang.so.2 \
libslang2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

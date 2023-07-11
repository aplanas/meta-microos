SUMMARY = "Programming Library and Embeddable Extension Language - Development Package"
DESCRIPTION = "S-Lang is a programming library for creating multi-platform software. \
It provides display/screen management, keyboard input, keymaps, etc. \
Another feature is the interpreter for the S-Lang extension language \
which can be embedded into an application to make it extensible. With \
slsh, a standalone interpreter is available as well. \
 \
This package contains all necessary include files and libraries needed to \
develop applications that require it."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.3"

RPM_NAME = "slang-devel-2.3.3-1.4.aarch64.rpm"
RPM_HASH = "c187bc3d3952d24d3b073e6e712755496a832ed095764d6e9b21f65eaea52d00bd3a3c539470a4d721af6c538aa6607a2a35d0a3489466eadc937f91bd1f54c8"

RPROVIDES:${PN} += "pkgconfig-slang \
slang-/usr/include/slang.h \
slang-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libslang2"

inherit rpm

SUMMARY = "Development files for libx86emu"
DESCRIPTION = "An x86 emulation library with focus on usage and \
execution logging functions. \
 \
This package contains the header files for the library API."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "libx86emu-devel-3.5-1.9.aarch64.rpm"
RPM_HASH = "ca9ec4fab8f13b4186a067ee96320e29da43231ac0537ea4e68189668bf1b1aadb3d21f966b55e3b0270db44f97206596136b194b9aed5c62e81f0363ea28ffa"

RPROVIDES:${PN} += "libx86emu-devel"

RDEPENDS:${PN} += "libx86emu3"

inherit rpm

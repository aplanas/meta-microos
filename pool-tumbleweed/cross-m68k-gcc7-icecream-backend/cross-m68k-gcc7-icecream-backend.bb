SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-m68k-gcc7-icecream-backend-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "a732c55fd4221c127af6c558068efe037ed4a474e76e611fad1859a24e1d8a10ca4263a217af3e175469f32baf1d4b1baad5273c87b98f3c0b6c20a5f54d687e"

RPROVIDES:${PN} += "cross-m68k-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

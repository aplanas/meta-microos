SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-i386-gcc7-icecream-backend-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "193dde6feef4479d58cff1a5c7dc0e9c328b7394951ecc9d6f7521347213bc3d0e560fbd8a1c0dc39c9601c67583ffe9e2ebd56ad257e08889f4bf5eb5295cf8"

RPROVIDES:${PN} += "cross-i386-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

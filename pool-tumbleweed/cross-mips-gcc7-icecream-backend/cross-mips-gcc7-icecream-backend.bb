SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-mips-gcc7-icecream-backend-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "c3d3df6f8d218deb93248126f2c50af10184bcc3f6ce5eeeead60d9d574821c575d7d718d9242b008442e59ac2491d11a6a931b4b2a037075defb2cdc9e425a9"

RPROVIDES:${PN} += "cross-mips-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

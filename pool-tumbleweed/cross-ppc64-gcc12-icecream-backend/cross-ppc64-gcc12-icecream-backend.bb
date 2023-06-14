SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-ppc64-gcc12-icecream-backend-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "59ff61fe0f86471845b885a3d2d652eabd902c7b7b0e4e5b1246a6aedf09a8187c7c620be834ca1c5722a7b428c4cfa6fb655cd3d5831c50b077381a7dca2312"

RPROVIDES:${PN} += "cross-ppc64-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

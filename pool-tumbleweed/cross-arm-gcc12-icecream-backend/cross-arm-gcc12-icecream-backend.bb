SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-arm-gcc12-icecream-backend-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "a1733a4e56efad37ccc3d0969cfcbe1c5c2195cd2d1355ec7c713e4f85a9fd145a9e616a09dc4074d61ece82bfda31b431196e6305d5d13bbcbc124b9fe0c051"

RPROVIDES:${PN} += "cross-arm-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

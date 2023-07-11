SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-x86_64-gcc12-icecream-backend-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "ef836c43ecd34358cc1040e6629f1d2238694eb642fd3534bbdb64e3dd57be76d42d7433d6f2df17a25d63c90f9a40d58f49e22a45354ff12c8b7f5439002e66"

RPROVIDES:${PN} += "cross-x86-64-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

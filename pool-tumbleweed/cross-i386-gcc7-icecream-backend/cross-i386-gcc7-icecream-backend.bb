SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-i386-gcc7-icecream-backend-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "114052c52d4f549c0fca897853ead54ce1909b72b47876345d9244d91322ecbc7dcf44cc0ea8b0584f6c5ae1d1a804c353d62a39db02d7472b85a31a16060353"

RPROVIDES:${PN} += "cross-i386-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

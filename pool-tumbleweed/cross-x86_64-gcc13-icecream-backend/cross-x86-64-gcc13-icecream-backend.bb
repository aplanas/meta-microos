SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-x86_64-gcc13-icecream-backend-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "0d99c3509e376d0e0ec96bcae2081c834b17aafd32b98220adb3c06e1833adc888991863658d6553b679aea51b824ac2d63ac8ff22d1feda5344f9ad6525a37a"

RPROVIDES:${PN} += "cross-x86-64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

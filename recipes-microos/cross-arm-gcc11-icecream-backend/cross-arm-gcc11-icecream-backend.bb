SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-arm-gcc11-icecream-backend-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "61df7a1c9a6e631aa4faf8c0f8e97676eb7a26a558350a135273f073dc38fe3437b67f87bd9fa0a65468a6f4be65970f3abd246f8ef0e09a5860e33293330ff0"

RPROVIDES:${PN} += "cross-arm-gcc11-icecream-backend cross-arm-gcc11-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-arm-gcc13-icecream-backend-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "f367898a07433c904370f90def63455365349aafec72560ad177ef82e078275c63eb08c456f75484cf6e8c8524bc8aefd082330423196a902d3ca86c3e6b7544"

RPROVIDES:${PN} += "cross-arm-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-m68k-gcc13-icecream-backend-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "35811bb97e9156686b2af7f0e7c4ac8c70b72e0e0778d06bed0aeca4e4434c5e2e059ca34b2802edaae50cab88aae302f11bfeec09244c3900456882ecd737e9"

RPROVIDES:${PN} += "cross-m68k-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

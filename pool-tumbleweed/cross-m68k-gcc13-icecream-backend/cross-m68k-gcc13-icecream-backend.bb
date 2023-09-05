SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-m68k-gcc13-icecream-backend-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "4f4c9d856c10b1fdc137fa11ab6bb199005194c01d35d69a8fd5b337dccbf07cc766040f9de651d42e0333a3493642322ec4cbbef80e9771d22694026f0d5f54"

RPROVIDES:${PN} += "cross-m68k-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-ppc64-gcc13-icecream-backend-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "b392292ce0ab9166bd4f6911b38dedf37e718991644d93314b59fe831e027ae3e70df1524cf4428fe9a957f091566b0a75ed0f7b0e6502c04cbd0fdfefbe3815"

RPROVIDES:${PN} += "cross-ppc64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-ppc64-gcc13-icecream-backend-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "cd2212ebc71a3341507343516640737826237e47c466e28d348f75918b15a79b8463a36ce86e489558a9fed70a860a30f05037293e2ae0133d588494d29c9df0"

RPROVIDES:${PN} += "cross-ppc64-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

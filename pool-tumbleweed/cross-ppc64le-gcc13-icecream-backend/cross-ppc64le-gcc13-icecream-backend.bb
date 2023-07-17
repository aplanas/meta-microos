SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7552"

RPM_NAME = "cross-ppc64le-gcc13-icecream-backend-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "1b8795e296a383c819a68155dfde26fa701ffdfe9a55a7a329f21b5e475b25c7c95396a2c27fa73286f391a975741509bf17ccae6767f841471d5834bb1c9c6f"

RPROVIDES:${PN} += "cross-ppc64le-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

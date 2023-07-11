SUMMARY = "Static library for capstone"
DESCRIPTION = "Statically linked libcapstone."
LICENSE = "BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "libcapstone-devel-static-4.0.2-2.4.aarch64.rpm"
RPM_HASH = "230753ef8663886e4fee6c5cb68b5e7ec0e9309d5c5d28c25d7a076ea1d685d7b57bb84be608afe03cf99d54952828dfbb99ea271f5deca1391786ab0acfe2e4"

RPROVIDES:${PN} += "libcapstone-devel-static"

RDEPENDS:${PN} += "libcapstone-devel"

inherit rpm

SUMMARY = "EFL testsuite"
DESCRIPTION = "Testsuite of EFL package."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & Zlib"

PV = "1.26.3"

RPM_NAME = "efl-testsuite-1.26.3-30.8.aarch64.rpm"
RPM_HASH = "3aa400681bdd973fe72cd25e7793a063bf8ba910fd5a2449453ff072bf9d1f87362d8030e8044464d08147372c9c7bcb21f9e5a15b5a7b2db2f97332f94744bc"

RPROVIDES:${PN} += "efl-testsuite"

RDEPENDS:${PN} += "libefreet1"

inherit rpm

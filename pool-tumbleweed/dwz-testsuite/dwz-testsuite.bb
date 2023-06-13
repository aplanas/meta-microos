SUMMARY = "Testsuite results from DWZ"
DESCRIPTION = "This package contains the testsuite results from DWZ."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.15"

RPM_NAME = "dwz-testsuite-0.15-2.3.aarch64.rpm"
RPM_HASH = "81d53ae0f837910814aba9f6dbb7c5f3cb5f1a9d6441ac47f8fd67d46f360d2c0885b4fbd135a7f49a3ddcba2bbd5da6f277555e302ac23339b136f29f9d91b2"

RPROVIDES:${PN} += "dwz-testsuite \
dwz-testsuite(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

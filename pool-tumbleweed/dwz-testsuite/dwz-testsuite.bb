SUMMARY = "Testsuite results from DWZ"
DESCRIPTION = "This package contains the testsuite results from DWZ."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.15"

RPM_NAME = "dwz-testsuite-0.15-2.4.aarch64.rpm"
RPM_HASH = "e8a997a72ed0576d10aa126be673509cf717aef8d62d9af370069cae346d0ea9f44ebfec365b6dd04c2c4834eb4f5412a9197fd7cec310e3c15a9220556e1d7d"

RPROVIDES:${PN} += "dwz-testsuite"

RDEPENDS:${PN} += ""

inherit rpm

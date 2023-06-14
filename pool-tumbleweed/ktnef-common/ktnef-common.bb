SUMMARY = "Files requires by libKPim5Tnef5"
DESCRIPTION = "Files that can't be in the libKPim5Tnef5 package anymore."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktnef-common-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "431df736bef78a402adcb5b84867433129bb954e9a6bb8adf89586e1f589722618e7f456414ad350ff9739aeab3a1b1bbf7cbc1bd18c1056c00f3cad838c715a"

RPROVIDES:${PN} += "ktnef-common"

RDEPENDS:${PN} += ""

inherit rpm

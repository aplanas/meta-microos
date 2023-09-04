SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-m68k-gcc13-icecream-backend-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "460002093468a10b1f07b8334313f740b63e8e99d7e7c3445b626edbb1b19527f8b89fdc8737a6b3ead74d250d5754f4d4c1758200054bd399f644489ff8cb33"

RPROVIDES:${PN} += "cross-m68k-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

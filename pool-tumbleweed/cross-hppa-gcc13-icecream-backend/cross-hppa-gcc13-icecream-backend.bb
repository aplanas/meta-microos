SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-hppa-gcc13-icecream-backend-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "eed15a796f1b1f2f026374ac3a21702bfaa8e4247dfb065763d81af93eb3ca48bc80ec6e2cba6be518f0305eec6880bb132552c1787d61bb923d3b6b6dfee724"

RPROVIDES:${PN} += "cross-hppa-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm

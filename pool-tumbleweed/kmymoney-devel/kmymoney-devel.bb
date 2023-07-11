SUMMARY = "Development Files for KMyMoney"
DESCRIPTION = "Development files and headers need to build software using KMyMoney."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.1.3"

RPM_NAME = "kmymoney-devel-5.1.3-2.12.aarch64.rpm"
RPM_HASH = "3a8e7fce22ebecc5be76c74fcece81bb000a966f8b665e2b08540d5ca00a2553dd9484a186268ea7889c24f9e23c883a4ed8e894e573e63da452849ed0991427"

RPROVIDES:${PN} += "kmymoney-devel"

RDEPENDS:${PN} += "kmymoney"

inherit rpm

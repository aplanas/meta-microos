SUMMARY = "Package provides recommended R-boot"
DESCRIPTION = "This packages provides R-boot, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.3.28"

RPM_NAME = "R-boot-1.3.28-45.1.aarch64.rpm"
RPM_HASH = "7c508c539490ae051b5469b736e62d1f528dad8d8f3e6cee70e400bdd313e3e7a8eaab2cc616d713957ec2e18c77a4d6ed62d835d627bc8cc00f062a7891e03d"

RPROVIDES:${PN} += "R-boot R-boot(aarch-64)"
RDEPENDS:${PN} += "R-base"

inherit rpm

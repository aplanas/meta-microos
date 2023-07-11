SUMMARY = "Package provides recommended R-boot"
DESCRIPTION = "This packages provides R-boot, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.3.28"

RPM_NAME = "R-boot-1.3.28-46.1.aarch64.rpm"
RPM_HASH = "c2ab80d54969a2564fee83bec35a63a5b2892a30d33d01da19b517013f8f9bc7a469447aa85f95405f3fa019427706266ddb6bf24286e09f347cd5a0822a1152"

RPROVIDES:${PN} += "R-boot"

RDEPENDS:${PN} += "R-base"

inherit rpm

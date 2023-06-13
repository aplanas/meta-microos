SUMMARY = "Java CIM Client library"
DESCRIPTION = "The purpose of this package is to provide a CIM Client Class Library \
for Java applications. It complies to the DMTF standard CIM Operations \
over HTTP and intends to be compatible with JCP JSR48 once it becomes \
available. To learn more about DMTF visit http://www.dmtf.org. More \
infos about the Java Community Process and JSR48 can be found at \
http://www.jcp.org and http://www.jcp.org/en/jsr/detail?id=48."
LICENSE = "EPL-1.0"

PV = "2.2.5"

RPM_NAME = "sblim-cim-client2-2.2.5-7.3.noarch.rpm"
RPM_HASH = "1613e7abe0df7dcde42229c29752a31b66864566ac0412389eabf034c0be2a5fc86ef006461a3eae6c4780b46ed76b1df7c6e96c6f6c37922d90e62b4afe6fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(sblim-cim-client2) \
sblim-cim-client \
sblim-cim-client2"

RDEPENDS:${PN} += "jpackage-utils"

inherit rpm

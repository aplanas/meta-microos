SUMMARY = "Java CIM Client library"
DESCRIPTION = "The purpose of this package is to provide a CIM Client Class Library \
for Java applications. It complies to the DMTF standard CIM Operations \
over HTTP and intends to be compatible with JCP JSR48 once it becomes \
available. To learn more about DMTF visit http://www.dmtf.org. More \
infos about the Java Community Process and JSR48 can be found at \
http://www.jcp.org and http://www.jcp.org/en/jsr/detail?id=48."
LICENSE = "EPL-1.0"

PV = "2.2.5"

RPM_NAME = "sblim-cim-client2-2.2.5-7.4.noarch.rpm"
RPM_HASH = "c81e7daa0917d2e2a62dbcacd856190e31b39960f986f6836695dc181349738b092611de1496667d9ea7a1c201e6ed37bd3aba87084c7eb881acabe6b9a79d58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sblim-cim-client2 \
sblim-cim-client \
sblim-cim-client2"

RDEPENDS:${PN} += "jpackage-utils"

inherit rpm

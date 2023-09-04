SUMMARY = "API documentation for janino"
DESCRIPTION = "API documentation for janino."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "janino-javadoc-3.1.10-1.1.noarch.rpm"
RPM_HASH = "7b9e2a6d7e73b262757e7322bb02e13d39be2701b2e369bf3d4299438faa54a781ffa7e23bb29bb0dbe70d10dde20f28cda3f3591db3f2198455fa44ec8d86e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "janino-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "API documentation for glassfishbuild-maven-plugin"
DESCRIPTION = "This package provides API documentation for glassfishbuild-maven-plugin."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "3.2.26"

RPM_NAME = "glassfishbuild-maven-plugin-javadoc-3.2.26-2.10.noarch.rpm"
RPM_HASH = "6e288e3006a3ddd751413d495022fc9b73ca3f8ebb52dfb83a4790f2611552845507f6eeec8e30bd23eaee154a12abc75a010c77565c5747a1471b1903d77eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfishbuild-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

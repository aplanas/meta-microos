SUMMARY = "Javadoc for jboss-logging"
DESCRIPTION = "This package contains the API documentation for jboss-logging."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "jboss-logging-javadoc-3.4.1-4.1.noarch.rpm"
RPM_HASH = "1c48a79f3a61d5ba5e3edcdc022ab59666b3c0f2b416ba214bfd3128db039be90f29f92bb6f23d3a4ee130a0be252b04a37668dc3017139826b01da9d704ab80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

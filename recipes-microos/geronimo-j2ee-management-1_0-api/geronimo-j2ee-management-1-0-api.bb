SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Application Management Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-management-1_0-api-1.2-36.11.noarch.rpm"
RPM_HASH = "6a9cd8e6b88abdd4168b232b55465ebda35a63245015aee26d31ae9cd2c2ec18ebfb420bf2dffec1b13ce8f63dfaf50ec4217c13fd3528a3eaacf4d5f4c32f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-j2ee-management-1_0-api j2ee-management j2ee_management_1_0_api j2ee_management_api mvn(org.apache.geronimo.specs:geronimo-j2ee-management_1.0_spec) mvn(org.apache.geronimo.specs:geronimo-j2ee-management_1.0_spec:pom:)"
RDEPENDS:${PN} += "/bin/sh ejb_2_1_api java-headless javapackages-filesystem update-alternatives"

inherit rpm

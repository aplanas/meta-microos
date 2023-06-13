SUMMARY = "Velocity - Master POM"
DESCRIPTION = "Master POM for Velocity."
LICENSE = "Apache-2.0"

PV = "4"

RPM_NAME = "velocity-master-4-2.4.noarch.rpm"
RPM_HASH = "ba6c9c92d1dba3f105d29147e4ed953e0f0896dd279ae52e251661dda9fbaa3f45a614d9de249f0167ac7f561205e10e0f47e8492250b00368a86b304a3855eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.apache.velocity:velocity-master:pom:) \
velocity-master"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache:apache:pom:)"

inherit rpm

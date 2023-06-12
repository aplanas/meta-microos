SUMMARY = "A YAML processor based on Syck"
DESCRIPTION = "Yecht is a Syck port, a YAML 1.0 processor for Ruby."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "yecht-1.1-1.18.noarch.rpm"
RPM_HASH = "3d020feb45b02acbbf8ead4d285bdcf59d51665209898beafed3a4a5517c7a703bf329ff2cb3c887d270455b4b9a15249c0139147c49a310c9310534311a2dfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.jruby:yecht) \
mvn(org.jruby:yecht::jruby:) \
mvn(org.jruby:yecht:pom:) \
mvn(org.jruby:yecht:pom:jruby:) \
yecht"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

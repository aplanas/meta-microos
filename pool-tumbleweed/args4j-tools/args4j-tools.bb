SUMMARY = "Development-time tool for generating additional artifacts"
DESCRIPTION = "This package contains args4j development-time tool for generating \
additional artifacts."
LICENSE = "MIT"

PV = "2.33"

RPM_NAME = "args4j-tools-2.33-2.6.noarch.rpm"
RPM_HASH = "e8b8c501cf8127105550b0d5cf8cafd00f424e4302babc4bb608f02e3b5e35898d3c3d98c4369b396f18dbbcaa62913cad61e0223aabc6cd2bdf87952ad95042"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "args4j-tools \
mvn(args4j:args4j-tools) \
mvn(args4j:args4j-tools:pom:) \
osgi(org.kohsuke.args4j-tools)"

RDEPENDS:${PN} += "args4j \
java-headless \
javapackages-filesystem \
mvn(args4j:args4j)"

inherit rpm

SUMMARY = "Development-time tool for generating additional artifacts"
DESCRIPTION = "This package contains args4j development-time tool for generating \
additional artifacts."
LICENSE = "MIT"

PV = "2.33"

RPM_NAME = "args4j-tools-2.33-2.7.noarch.rpm"
RPM_HASH = "ee7a9c7b5b6b3e9df0138bcb492530838f29668d04f5d5d7b44c94fbf33726e0d86618741c4d8310854cd9f7460afdaa3a9ffb99a3bb4d0f7c4ea078dd53ee23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "args4j-tools \
mvn-args4j-args4j-tools \
mvn-args4j-args4j-tools-pom- \
osgi-org.kohsuke.args4j-tools"

RDEPENDS:${PN} += "args4j \
java-headless \
javapackages-filesystem \
mvn-args4j-args4j"

inherit rpm

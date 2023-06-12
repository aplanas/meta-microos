SUMMARY = "error-prone annotations"
DESCRIPTION = "Google Error Prone is a static analysis tool for Java that catches \
common programming mistakes at compile-time. \
 \
This package contains Google Error Prone annotations"
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "google-errorprone-annotations-2.11.0-2.1.noarch.rpm"
RPM_HASH = "7af846a96cfad5c99e7cc84e94ab97ea35ad5d3411e41de80c85e5dbd8e1577bd3d7dfbf12f41122eaeff467990822c8ecc43b0f88a2d23cf9d904c6d27d073f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-annotations \
mvn(com.google.errorprone:error_prone_annotations) \
mvn(com.google.errorprone:error_prone_annotations:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

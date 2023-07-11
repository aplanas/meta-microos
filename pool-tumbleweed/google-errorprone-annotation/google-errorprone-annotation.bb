SUMMARY = "@BugPattern annotation"
DESCRIPTION = "@BugPattern annotation for Google Error Prone"
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "google-errorprone-annotation-2.11.0-2.2.noarch.rpm"
RPM_HASH = "1ec01090c513d8d6524f83105d8c83ea63155c0bfe59650e505d7824583fe6167d645370bc10c4a1dc8e3109e37dbdda2e84d16c438eb4858d979ead87ee7513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-errorprone-annotation \
mvn-com.google.errorprone-error-prone-annotation \
mvn-com.google.errorprone-error-prone-annotation-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava"

inherit rpm

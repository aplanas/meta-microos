SUMMARY = "Apache Log4j BOM"
DESCRIPTION = "Apache Log4j 2 Bill of Material"
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-bom-2.17.2-5.7.noarch.rpm"
RPM_HASH = "99ff43fde7f169565bc849c11cbda29b59734d71270b64043c427ad5a38ec2a65fa75cd47f584cbc07ba3dc290b58f1df4ffa63428c47ef4d7a06270b93db37c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-bom \
mvn-org.apache.logging.log4j-log4j-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.logging-logging-parent-pom-"

inherit rpm

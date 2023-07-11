SUMMARY = "Javadoc for docker-client-java"
DESCRIPTION = "This package contains javadoc for docker-client-java."
LICENSE = "Apache-2.0"

PV = "8.11.7"

RPM_NAME = "docker-client-java-javadoc-8.11.7-3.11.noarch.rpm"
RPM_HASH = "6c0503727b6e94646b17271d0883f7b9e48564ee66ac70598a68c6690bfb4d85b3f5ec2e350f654159c159569a933d2f178885b1dddf9d1cdc2df980c4e7fde6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-client-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

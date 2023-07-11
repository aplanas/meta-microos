SUMMARY = "Java Concurrency in Practice"
DESCRIPTION = "Class, field, and method level annotations for describing thread-safety \
policies."
LICENSE = "CC-BY-2.5"

PV = "1.0"

RPM_NAME = "jcip-annotations-1.0-21.6.noarch.rpm"
RPM_HASH = "7a86afece31b2c4cc1a956a1e37d6c6d911b54e80fb75307953711cf62ccf45e6511446ebfd28da2fd0f26a9403b303b596f325ff9ad43edfa2af7680e23e4b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcip-annotations \
mvn-net.jcip-jcip-annotations \
mvn-net.jcip-jcip-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

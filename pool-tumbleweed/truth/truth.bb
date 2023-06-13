SUMMARY = "An assertion framework for Java unit tests"
DESCRIPTION = "Truth is a library provides alternative ways to express assertions in \
unit tests. It can be used as a replacement for JUnit's assertions or FEST \
or it can be used alongside where other approaches seem more suitable."
LICENSE = "Apache-2.0"

PV = "0.24"

RPM_NAME = "truth-0.24-3.10.noarch.rpm"
RPM_HASH = "c390d86c660bbad618fbfff4b01381d59f80147de3a0d910f28e2d9eb25c8738ed572b26bd6b67f3b2b5061c90dd73023789ad1c8f15d3a5b4e36dc4d4ae8be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(com.google.truth:truth) \
mvn(com.google.truth:truth-parent:pom:) \
mvn(com.google.truth:truth:pom:) \
truth"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.google.auto.value:auto-value-annotations) \
mvn(com.google.guava:guava) \
mvn(junit:junit)"

inherit rpm

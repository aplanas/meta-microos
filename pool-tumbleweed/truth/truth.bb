SUMMARY = "An assertion framework for Java unit tests"
DESCRIPTION = "Truth is a library provides alternative ways to express assertions in \
unit tests. It can be used as a replacement for JUnit's assertions or FEST \
or it can be used alongside where other approaches seem more suitable."
LICENSE = "Apache-2.0"

PV = "0.24"

RPM_NAME = "truth-0.24-3.11.noarch.rpm"
RPM_HASH = "fe58dc4f1195e465b0a52adc6edbbe549f5479754111061664dbf1dc293fe4b719c44e7c556fd761ac4f23ec08c984cba647ec9c0f0bc71360eb4b124187c524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.google.truth-truth \
mvn-com.google.truth-truth-parent-pom- \
mvn-com.google.truth-truth-pom- \
truth"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.auto.value-auto-value-annotations \
mvn-com.google.guava-guava \
mvn-junit-junit"

inherit rpm

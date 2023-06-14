SUMMARY = "Correctness annotations for Java code"
DESCRIPTION = "This package contains reference implementations, test cases, and other \
documents for Java Specification Request 305: Annotations for Software Defect \
Detection."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "jsr-305-3.0.2-2.6.noarch.rpm"
RPM_HASH = "683ac8b2ced0ace9288b94c7f1ca82d8533f70a9c4577ab2bae31ecce8d4733ab421631436d35a13e25478ee4fb3f96e1bd42a8008be1c25d11f8e2f1e0368a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsr-305 \
mvn-com.google.code.findbugs-jsr305 \
mvn-com.google.code.findbugs-jsr305-pom- \
osgi-org.jsr-305"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

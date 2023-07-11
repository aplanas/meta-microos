SUMMARY = "Correctness annotations for Java code"
DESCRIPTION = "This package contains reference implementations, test cases, and other \
documents for Java Specification Request 305: Annotations for Software Defect \
Detection."
LICENSE = "BSD-3-Clause"

PV = "3.0.2"

RPM_NAME = "jsr-305-3.0.2-2.7.noarch.rpm"
RPM_HASH = "7ac35e8b8158f600800036ad13d430bea44d464fd694e6589ba87b3b94d772fce9757fccd6fcb9370a4b609dbf3354d4d71e3608b51681a895f3cd573e42bec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsr-305 \
mvn-com.google.code.findbugs-jsr305 \
mvn-com.google.code.findbugs-jsr305-pom- \
osgi-org.jsr-305"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

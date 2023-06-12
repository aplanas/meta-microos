SUMMARY = "Library of assertions similar to fest-assert"
DESCRIPTION = "A set of strongly-typed assertions to use for unit testing \
(either with JUnit or TestNG)."
LICENSE = "Apache-2.0"

PV = "3.8.0"

RPM_NAME = "assertj-core-3.8.0-1.22.noarch.rpm"
RPM_HASH = "848632958090e7665fb7eb87a40c33ea021e607eb13aa2f44183bfc29c118a076ca34ae9f1382511a8e40e829a310c85114b75ade76f06542cf040766f7a2ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "assertj-core \
mvn(org.assertj:assertj-core) \
mvn(org.assertj:assertj-core:pom:) \
osgi(org.assertj.core)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.mockito:mockito-core)"

inherit rpm

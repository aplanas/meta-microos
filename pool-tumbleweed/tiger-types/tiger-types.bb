SUMMARY = "Type arithmetic library for Java5"
DESCRIPTION = "This library provides functions that perform type arithemtic over the \
type system of Java5. For example, one can compute that List<String> \
is a sub-type of Collection<String> but not Collection<Object>, you \
can compute the erasure of java.lang.reflect.Type, or you can \
determine the array component type T from A[T]."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.2"

RPM_NAME = "tiger-types-2.2-5.1.noarch.rpm"
RPM_HASH = "6e6e32877e5c0297e4a65b3be7c3886e0af89370a826527b6d8a2716db1c3268230764a035d403b075292b1408f599e88ec327b0c3e6f7b0b90714fb293979dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jvnet-tiger-types \
mvn-org.jvnet-tiger-types-pom- \
osgi-org.jvnet.tiger-types \
tiger-types"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

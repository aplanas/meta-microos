SUMMARY = "Type arithmetic library for Java5"
DESCRIPTION = "This library provides functions that perform type arithemtic over the \
type system of Java5. For example, one can compute that List<String> \
is a sub-type of Collection<String> but not Collection<Object>, you \
can compute the erasure of java.lang.reflect.Type, or you can \
determine the array component type T from A[T]."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.2"

RPM_NAME = "tiger-types-2.2-4.11.noarch.rpm"
RPM_HASH = "540812bd33d728da140a799dfaa5d9bc6e3fbd86a7fdfa6fc85a83c273917b2c86b27928e789ae4b8693fee99f395f29383aae99c836b915d2332c1a2986e101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jvnet-tiger-types \
mvn-org.jvnet-tiger-types-pom- \
osgi-org.jvnet.tiger-types \
tiger-types"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

SUMMARY = "A library of SAT solvers written in Java"
DESCRIPTION = "The aim of the SAT4J library is to provide an efficient library of SAT \
solvers in Java. The SAT4J library targets first users of SAT 'black \
boxes', those willing to embed SAT technologies into their application \
without worrying about the details."
LICENSE = "EPL-1.0 & LGPL-2.0-only"

PV = "2.3.5"

RPM_NAME = "sat4j-2.3.5-3.1.noarch.rpm"
RPM_HASH = "c3bd7b4131b3df8f4825be4b77260f9547be7fb3c17c1159c0c3a7980a27a1943e66e9a215448bb8021e6d542df11b4a05365b6f38dd7a0bbe19d18e9491e678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.ow2.sat4j:org.ow2.sat4j.core) \
mvn(org.ow2.sat4j:org.ow2.sat4j.core:pom:) \
mvn(org.ow2.sat4j:org.ow2.sat4j.pb) \
mvn(org.ow2.sat4j:org.ow2.sat4j.pb:pom:) \
osgi(org.sat4j.core) \
osgi(org.sat4j.pb) \
sat4j"
RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm

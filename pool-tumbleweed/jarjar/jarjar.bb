SUMMARY = "Tool to repackage Java libraries"
DESCRIPTION = "Jar Jar Links is a utility that makes it easy to repackage Java \
libraries and embed them into your own distribution. This is useful for \
two reasons: You can easily ship a single jar file with no external \
dependencies. You can avoid problems where your library depends on a \
specific version of a library, which may conflict with the dependencies \
of another library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "jarjar-1.4-4.12.noarch.rpm"
RPM_HASH = "0b1bbb54b4e091a79bdeb5d9abc5d47e31d6de723cce6692ff2eda87658da518e53a435ca654efb8d0f9df86f9cf075a28e50a68de0eee56ea49fdb054939920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jarjar \
mvn-com.googlecode.jarjar-jarjar \
mvn-com.googlecode.jarjar-jarjar-pom- \
mvn-com.tonicsystems-jarjar \
mvn-com.tonicsystems-jarjar-pom- \
mvn-com.tonicsystems-jarjar-util \
mvn-com.tonicsystems-jarjar-util-pom- \
mvn-jarjar-jarjar \
mvn-jarjar-jarjar-pom- \
mvn-jarjar-jarjar-util \
mvn-jarjar-jarjar-util-pom- \
mvn-org.gradle.jarjar-jarjar \
mvn-org.gradle.jarjar-jarjar-pom- \
mvn-tonic-jarjar \
mvn-tonic-jarjar-pom- \
mvn-tonic-jarjar-util \
mvn-tonic-jarjar-util-pom-"

RDEPENDS:${PN} += "gnu-regexp \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-util \
objectweb-anttask \
objectweb-asm"

inherit rpm

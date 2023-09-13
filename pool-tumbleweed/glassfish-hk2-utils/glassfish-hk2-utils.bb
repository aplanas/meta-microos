SUMMARY = "HK2 Implementation Utilities"
DESCRIPTION = "Hundred Kilobytes Kernel Implementation Utilities."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-utils-2.5.0-4.1.noarch.rpm"
RPM_HASH = "6a17b7a272b3f2554b482f9110dd503000f0673dfed19409bdd5bfc77be115b7ab407c75b9ba5c89cae00409d03cf64814346a245e1b0af725931919ef17a44a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-utils \
mvn-org.glassfish.hk2-hk2-utils \
mvn-org.glassfish.hk2-hk2-utils-pom- \
osgi-org.glassfish.hk2.utils"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.inject-javax.inject"

inherit rpm

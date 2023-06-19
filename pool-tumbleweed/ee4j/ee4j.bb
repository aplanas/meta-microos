SUMMARY = "EE4J Project"
DESCRIPTION = "Eclipse Enterprise for Java (EE4J) is an open source initiative to create standard \
APIs, implementations of those APIs, and technology compatibility kits for Java \
runtimes that enable development, deployment, and management of server-side and \
cloud-native applications. \
 \
EE4J is based on the Java(TM) Platform, Enterprise Edition (Java EE) standards, \
and uses Java EE 8 as the baseline for creating new standards."
LICENSE = "EPL-2.0 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.7"

RPM_NAME = "ee4j-1.0.7-1.5.noarch.rpm"
RPM_HASH = "ddb9c7dcd3447bd22cb09662488e78e0d92ee880f116559a3c8d13af05bb14d9542b2fd3274a5a52d4e79fbb3e4b5dd2084c83eafccd9669af202ec3c292c4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ee4j \
mvn-org.eclipse.ee4j-project-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

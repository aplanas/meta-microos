SUMMARY = "Java components interfaces"
DESCRIPTION = "The Avalon framework consists of interfaces that define relationships \
between commonly used application components, best-of-practice pattern \
enforcements, and several lightweight convenience implementations of the \
generic components. \
What that means is that we define the central interface Component. We \
also define the relationship (contract) a component has with peers, \
ancestors and children."
LICENSE = "Apache-2.0"

PV = "4.3"

RPM_NAME = "avalon-framework-4.3-4.6.noarch.rpm"
RPM_HASH = "a451800260d1aaf3a55e58062c75632b9f033f570805d7d0545577c41be1aeccff2869b2d1e7d5833b14c3f8a2b882b2e0d2b632de9fa41d0dee794360c783bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-framework mvn(avalon-framework:avalon-framework-api) mvn(avalon-framework:avalon-framework-api:pom:) mvn(avalon-framework:avalon-framework-impl) mvn(avalon-framework:avalon-framework-impl:pom:) mvn(org.apache.avalon.framework:avalon-framework-api) mvn(org.apache.avalon.framework:avalon-framework-api:pom:) mvn(org.apache.avalon.framework:avalon-framework-impl) mvn(org.apache.avalon.framework:avalon-framework-impl:pom:) osgi(avalon-framework-api-4.3) osgi(avalon-framework-impl-4.3)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(avalon-logkit:avalon-logkit)"

inherit rpm

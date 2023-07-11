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

RPM_NAME = "avalon-framework-4.3-4.7.noarch.rpm"
RPM_HASH = "3705cbe5415b12eaf4a1fd3d5341d606b272fe68fad57caafb84595582b3d0bbb4ed7e92083d442ededa33bac6f23fbadf6468a54e8ba6e018ab5d12d2c8f864"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-framework \
mvn-avalon-framework-avalon-framework-api \
mvn-avalon-framework-avalon-framework-api-pom- \
mvn-avalon-framework-avalon-framework-impl \
mvn-avalon-framework-avalon-framework-impl-pom- \
mvn-org.apache.avalon.framework-avalon-framework-api \
mvn-org.apache.avalon.framework-avalon-framework-api-pom- \
mvn-org.apache.avalon.framework-avalon-framework-impl \
mvn-org.apache.avalon.framework-avalon-framework-impl-pom- \
osgi-avalon-framework-api-4.3 \
osgi-avalon-framework-impl-4.3"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-avalon-logkit-avalon-logkit"

inherit rpm

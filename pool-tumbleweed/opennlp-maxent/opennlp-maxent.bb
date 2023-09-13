SUMMARY = "Apache OpenNLP Maxent"
DESCRIPTION = "This package provides Apache OpenNLP Maxent."
LICENSE = "Apache-2.0"

PV = "1.5.3"

RPM_NAME = "opennlp-maxent-1.5.3-4.1.noarch.rpm"
RPM_HASH = "afdeb3f776215e2f92529d3dcc10d5016d8ed2f3fd9227dc613006e953e90bc22db88cb40de3cc406e867636e5c979ffbe658cb960aef9c95e50cfaabe408f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.opennlp-opennlp-maxent \
mvn-org.apache.opennlp-opennlp-maxent-pom- \
opennlp-maxent \
osgi-org.apache.opennlp.maxent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

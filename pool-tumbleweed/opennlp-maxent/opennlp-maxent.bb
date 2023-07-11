SUMMARY = "Apache OpenNLP Maxent"
DESCRIPTION = "This package provides Apache OpenNLP Maxent."
LICENSE = "Apache-2.0"

PV = "1.5.3"

RPM_NAME = "opennlp-maxent-1.5.3-3.11.noarch.rpm"
RPM_HASH = "a9ffb64488b58e68c4b26bebe92da5206abda8bb003a622c0167fe2a678ad8a4dc05cf1f238187a1d8b84939d4b82f9328745a8372a4294ff1e654e99a3a3722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.opennlp-opennlp-maxent \
mvn-org.apache.opennlp-opennlp-maxent-pom- \
opennlp-maxent \
osgi-org.apache.opennlp.maxent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

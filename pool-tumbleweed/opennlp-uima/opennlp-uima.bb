SUMMARY = "Apache OpenNLP UIMA Annotators"
DESCRIPTION = "This package provides Apache OpenNLP UIMA Annotators."
LICENSE = "Apache-2.0"

PV = "1.5.3"

RPM_NAME = "opennlp-uima-1.5.3-3.11.noarch.rpm"
RPM_HASH = "cf7f8c5a70e6fd4ba4b162a67767c3692dbf84da9615a4072608bd26d1e4f5784ccbfba5585dee446e44d5313f9043c078c6fd9e1681af8bce2d52c2e5f4e98d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.opennlp-opennlp-uima \
mvn-org.apache.opennlp-opennlp-uima-pom- \
opennlp-uima"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.opennlp-opennlp-tools"

inherit rpm

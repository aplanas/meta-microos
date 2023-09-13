SUMMARY = "Apache OpenNLP UIMA Annotators"
DESCRIPTION = "This package provides Apache OpenNLP UIMA Annotators."
LICENSE = "Apache-2.0"

PV = "1.5.3"

RPM_NAME = "opennlp-uima-1.5.3-4.1.noarch.rpm"
RPM_HASH = "403bccb8e2f8935aa06827157f352dc61fccb10932f779cf8642439b1bbc3f8c424833a768dd37af6f154c1da39eb4bcdc2505c78a2ae6b8557a8a1bb39827b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.opennlp-opennlp-uima \
mvn-org.apache.opennlp-opennlp-uima-pom- \
opennlp-uima"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.opennlp-opennlp-tools"

inherit rpm

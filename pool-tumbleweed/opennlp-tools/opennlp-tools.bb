SUMMARY = "Apache OpenNLP Tools"
DESCRIPTION = "This package provides Apache OpenNLP Tools."
LICENSE = "Apache-2.0"

PV = "1.5.3"

RPM_NAME = "opennlp-tools-1.5.3-4.1.noarch.rpm"
RPM_HASH = "f6e805314cd4f16e6f11d69ecbd9d2c83795730c87056ea39a1e6f1991b2b5ed7731e8ff32fd440c09063012e01a25a59cb6f5995aa83ef9b049f40e953220c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.opennlp-opennlp-tools \
mvn-org.apache.opennlp-opennlp-tools-pom- \
opennlp-tools \
osgi-org.apache.opennlp.tools"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.sf.jwordnet-jwnl \
mvn-org.apache.opennlp-opennlp-maxent"

inherit rpm

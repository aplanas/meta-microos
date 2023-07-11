SUMMARY = "Apache OpenNLP Tools"
DESCRIPTION = "This package provides Apache OpenNLP Tools."
LICENSE = "Apache-2.0"

PV = "1.5.3"

RPM_NAME = "opennlp-tools-1.5.3-3.11.noarch.rpm"
RPM_HASH = "7b83dca731fb5086441a2fa1f4c78d84b93d71dea876d803cab3e632b29b46ceea0020ac971319e1750113555f77dd5da65d17813eba6c0e9118f70b8fce4ddc"
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

SUMMARY = "TXW2 Runtime"
DESCRIPTION = "TXW is a library that allows you to write XML documents."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-txw2-2.3.1-4.5.noarch.rpm"
RPM_HASH = "876a6bae112b9046f460e1e57d05d3c94bf2fc9701e245af2919c15d18fa927a2016a82be1beb6a70a57e7e84462bd03a53c951db7778fc6ddd6a0eda0fe2f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-txw2 \
mvn-org.glassfish.jaxb-txw2 \
mvn-org.glassfish.jaxb-txw2-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

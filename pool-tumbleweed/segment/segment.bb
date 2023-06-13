SUMMARY = "Split text into segments"
DESCRIPTION = "Segment program is used to split text into segments, for example sentences. \
Splitting rules are read from SRX file, which is standard format for this task."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "segment-2.0.1-1.18.noarch.rpm"
RPM_HASH = "43994f76db315a62bb0027495580c3b68f8f896a6c5b256ed306a9c122789d30e01e67ceb79f558bc2213ecf8fbfc11fc03f3e2dbb65d103dac47bf1abf4f9e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(net.loomchild:segment) \
mvn(net.loomchild:segment:pom:) \
segment"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-logging:commons-logging)"

inherit rpm

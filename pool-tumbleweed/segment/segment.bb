SUMMARY = "Split text into segments"
DESCRIPTION = "Segment program is used to split text into segments, for example sentences. \
Splitting rules are read from SRX file, which is standard format for this task."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "segment-2.0.1-1.19.noarch.rpm"
RPM_HASH = "499f2fb75b5efb64bc85a33a6765a4e32801c4d5f242d1b38f60839ae2666d8a3a1b0687aa0806f3f5ba375c12e35165b5990fccc824cc9e9dbe6a35252c4bfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.loomchild-segment \
mvn-net.loomchild-segment-pom- \
segment"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm

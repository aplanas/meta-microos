SUMMARY = "Pure Java implementation of XZ compression"
DESCRIPTION = "This is an implementation of XZ data compression in pure Java. \
Single-threaded streamed compression and decompression and random access \
decompression have been implemented."
LICENSE = "SUSE-Public-Domain"

PV = "1.9"

RPM_NAME = "xz-java-1.9-1.3.noarch.rpm"
RPM_HASH = "4f4ceb8081ad99ab6629f5e14896f4f311d9f958e86f35b26bd6b146f59c77abdf73f39d56ac7164959a7725ee903fcfec2947612a9814337a8248a6ec6aad6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-xz \
mvn-org.tukaani-xz \
mvn-org.tukaani-xz-pom- \
osgi-org.tukaani.xz \
xz-java"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

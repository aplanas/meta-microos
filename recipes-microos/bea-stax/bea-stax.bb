SUMMARY = "Streaming API for XML"
DESCRIPTION = "The Streaming API for XML (StAX) is a groundbreaking new Java API for \
parsing and writing XML easily and efficiently."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "bea-stax-1.2.0-37.16.noarch.rpm"
RPM_HASH = "d642cd103fc38aa3c653442c6a898767b54770b3c506dac00482058afe028b1d902090d133c84b7629a0c31379c41b8d485593963f6970e6ebde005bc26b7131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bea-stax mvn(stax:stax) mvn(stax:stax:pom:)"
RDEPENDS:${PN} += "bea-stax-api java-headless javapackages-filesystem mvn(junit:junit) mvn(stax:stax-api)"

inherit rpm

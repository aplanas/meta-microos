SUMMARY = "Javadoc for docker-client-java"
DESCRIPTION = "This package contains javadoc for docker-client-java."
LICENSE = "Apache-2.0"

PV = "8.11.7"

RPM_NAME = "docker-client-java-javadoc-8.11.7-3.10.noarch.rpm"
RPM_HASH = "dd11c648453440887292e3dd22accb6b45789699a990f7a80bede3b43faa9b48370239e52e6aeb11c7816aaa3ce4d88e4a9c78ca5b5713430d3703c9b11c9353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-client-java-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

SUMMARY = "Tool to extract class/interface/method definitions from sources"
DESCRIPTION = "QDox is a parser for extracting class/interface/method definitions \
from source files complete with JavaDoc @tags. It is designed to be \
used by active code generators or documentation tools."
LICENSE = "Apache-2.0"

PV = "2.0.3"

RPM_NAME = "qdox-2.0.3-1.1.noarch.rpm"
RPM_HASH = "c0b0b05fdb59afdd35925278c0bb9ef2fd16e7c816dce59bb9904a71c8daeeb20dc76cdd5be427034118bd6b780aeb7eb8599d17c78bacc199edeedc8189ad1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.qdox-qdox \
mvn-com.thoughtworks.qdox-qdox-pom- \
mvn-qdox-qdox \
mvn-qdox-qdox-pom- \
osgi-com.thoughtworks.qdox \
qdox"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

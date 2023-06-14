SUMMARY = "Public interfaces useful for applications to support RELAX Core"
DESCRIPTION = "The ISO RELAX project is started to host the public interfaces useful \
for applications to support RELAX Core. But nowadays some of the stuff \
we have is schema language neutral."
LICENSE = "Apache-2.0 & MIT"

PV = "0.1"

RPM_NAME = "isorelax-0.1-30.6.noarch.rpm"
RPM_HASH = "1b83042880ab15339a1679cbcca8981f40fdb561328efe0b52d4aa9303604cb5e0b66a570205a2e85b536c1c643c4ab3dba2a50d74c8f72983ab56d8d554df58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "isorelax \
isorelax-bootstrap \
mvn-isorelax-isorelax \
mvn-isorelax-isorelax-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
xerces-j2 \
xml-apis"

inherit rpm

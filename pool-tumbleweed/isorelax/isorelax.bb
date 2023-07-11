SUMMARY = "Public interfaces useful for applications to support RELAX Core"
DESCRIPTION = "The ISO RELAX project is started to host the public interfaces useful \
for applications to support RELAX Core. But nowadays some of the stuff \
we have is schema language neutral."
LICENSE = "Apache-2.0 & MIT"

PV = "0.1"

RPM_NAME = "isorelax-0.1-30.7.noarch.rpm"
RPM_HASH = "e7f8bd4c342b1d8c19770ffb6b239feef4bbbb3789b58329e33e995f0b3e740509c3c1c08a31be3c5766847bc94b1362d6962eacf2c824efb98ad24f9a9bf794"
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

SUMMARY = "StAX API extensions"
DESCRIPTION = "This project develops a few extensions to complement JSR-173 StAX API in the \
following area. \
 \
* Enable parser instance reuse (which is important in the \
  high-performance environment like JAXB and JAX-WS) \
* Improve the support for reading from non-text XML infoset, \
  such as FastInfoset. \
* Improve the namespace support."
LICENSE = "CDDL-1.0 | GPL-2.0-only"

PV = "1.8"

RPM_NAME = "stax-ex-1.8-4.4.noarch.rpm"
RPM_HASH = "26c8565c5ef826d1ba20b1aa8793652723cf26a8027fa39da94b033b0d22d05a7adc4d03550e9e7e25b3e232910e90a67e319465a0c9869f0764a419be9b47f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jvnet.staxex-stax-ex \
mvn-org.jvnet.staxex-stax-ex-pom- \
osgi-org.jvnet.staxex.stax-ex \
stax-ex"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.activation-activation"

inherit rpm

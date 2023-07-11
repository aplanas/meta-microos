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

RPM_NAME = "stax-ex-1.8-4.5.noarch.rpm"
RPM_HASH = "e25a75c01090443b1f4fe3e7502265350785096e10478ee7100454ff5e52995ad70233018ad8e8cbb76b9278ad3b39a90415c9614e705ababa587171c7d61b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jvnet.staxex-stax-ex \
mvn-org.jvnet.staxex-stax-ex-pom- \
osgi-org.jvnet.staxex.stax-ex \
stax-ex"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.activation-activation"

inherit rpm

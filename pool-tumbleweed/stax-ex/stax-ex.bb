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

RPM_NAME = "stax-ex-1.8-5.1.noarch.rpm"
RPM_HASH = "a65c330dd9719bb5fdbf48c4d0f06ce0c24bd96a34067c2e635ed0101302f2f5e3059473771991d4045f30e8fe71737bafd066a4ba13f9a12255b51a9ce39460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jvnet.staxex-stax-ex \
mvn-org.jvnet.staxex-stax-ex-pom- \
osgi-org.jvnet.staxex.stax-ex \
stax-ex"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.activation-activation"

inherit rpm

SUMMARY = "Java XML serialization library"
DESCRIPTION = "XStream is a simple library to serialize objects to XML \
and back again. A high level facade is supplied that \
simplifies common use cases. Custom objects can be serialized \
without need for specifying mappings. Speed and low memory \
footprint are a crucial part of the design, making it suitable \
for large object graphs or systems with high message throughput. \
No information is duplicated that can be obtained via reflection. \
This results in XML that is easier to read for humans and more \
compact than native Java serialization. XStream serializes internal \
fields, including private and final. Supports non-public and inner \
classes. Classes are not required to have default constructor. \
Duplicate references encountered in the object-model will be \
maintained. Supports circular references. By implementing an \
interface, XStream can serialize directly to/from any tree \
structure (not just XML). Strategies can be registered allowing \
customization of how particular types are represented as XML. \
When an exception occurs due to malformed XML, detailed diagnostics \
are provided to help isolate and fix the problem."
LICENSE = "BSD-3-Clause"

PV = "1.4.20"

RPM_NAME = "xstream-1.4.20-1.4.noarch.rpm"
RPM_HASH = "17d009e802d9f45932b43da03c99594c7b0c14ed40a8de32893bc07872c804148a444af8a42b869ee3b23a35d9637d2ae1a43c9859e6ef248a69aa29dfe45dd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.xstream-xstream \
mvn-com.thoughtworks.xstream-xstream-pom- \
osgi-xstream \
xstream"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-xpp3-xpp3 \
mvn-xpp3-xpp3-min"

inherit rpm

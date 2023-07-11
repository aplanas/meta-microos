SUMMARY = "Object graph serialization framework for Java"
DESCRIPTION = "Kryo is a fast and efficient object graph serialization framework for Java. \
The goals of the project are speed, efficiency, and an easy to use API. \
The project is useful any time objects need to be persisted, whether to a \
file, database, or over the network. \
 \
Kryo can also perform automatic deep and shallow copying/cloning. \
This is direct copying from object to object, not object->bytes->object."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "kryo-4.0.2-2.20.noarch.rpm"
RPM_HASH = "22299fccd2a64e81b7f87550233c6be2e2a70b0c0361e01112bd03ad9fe9107d689e46aea4f0b8d5237508077c5577fbf669e249919a7868ecc85a8ca36b84c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kryo \
mvn-com.esotericsoftware-kryo \
mvn-com.esotericsoftware-kryo-pom- \
mvn-com.esotericsoftware.kryo-kryo \
mvn-com.esotericsoftware.kryo-kryo-pom- \
osgi-com.esotericsoftware.kryo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.esotericsoftware-minlog \
mvn-com.esotericsoftware-reflectasm \
mvn-org.objenesis-objenesis"

inherit rpm

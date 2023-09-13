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

RPM_NAME = "kryo-4.0.2-3.1.noarch.rpm"
RPM_HASH = "45b078b3bb5792f964e35001ab6450e7f085eb43476b1a6ca4215d196d7fb072a1566fdd8fdeb05ebf6b4419be41b84e3a57dddb418ba808e360be13d14a769c"
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

SUMMARY = "Java/Mapscript map making extensions to Java"
DESCRIPTION = "The Java/Mapscript extension provides full map customization capabilities \
within the Java programming language."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "libjavamapscript-8.0.0-2.7.aarch64.rpm"
RPM_HASH = "0c92380cdc2b67c68d43a1661e3866e86c7bfe9d7961708e10bb3265e5ed264627f19371e0485998d64219b8e645e8a728459fe2ec32bcccd6e60daaa094b36d"

RPROVIDES:${PN} += "java-mapscript \
libjavamapscript \
libjavamapscript.so \
mapserver-java"

RDEPENDS:${PN} += "java \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmapserver.so.2 \
libmapserver2 \
swig"

inherit rpm

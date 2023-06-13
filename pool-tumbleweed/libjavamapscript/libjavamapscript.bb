SUMMARY = "Java/Mapscript map making extensions to Java"
DESCRIPTION = "The Java/Mapscript extension provides full map customization capabilities \
within the Java programming language."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "libjavamapscript-8.0.0-2.5.aarch64.rpm"
RPM_HASH = "7ee751fff7b7b58df733bda09ad066bb3068e5d9b62709fc1469bffa9491d887e1a7dd5e8dccfc9fdfa9af2a86eb0bb2a4cb3e045024c0e36a5eb1d368adb37f"

RPROVIDES:${PN} += "java-mapscript \
libjavamapscript \
libjavamapscript(aarch-64) \
libjavamapscript.so()(64bit) \
mapserver-java"

RDEPENDS:${PN} += "java \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmapserver.so.2()(64bit) \
libmapserver2 \
swig"

inherit rpm

SUMMARY = "The jffi JAR with native bits"
DESCRIPTION = "This package contains jffi JAR with native bits."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "1.3.11"

RPM_NAME = "jffi-native-1.3.11-2.1.aarch64.rpm"
RPM_HASH = "60686fd9a48be8d8957bd79f9eeb18f7ecce8ff71656410c50ef90bc276df21671e2fd32d419d7d5bee7cb3f2f46149085f663fd4ec89a02b1a478ff7e10e3b8"

RPROVIDES:${PN} += "jffi-native \
libjffi-1.2.so \
mvn-com.github.jnr-jffi--native- \
osgi-com.github.jnr.jffi.native"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
libc.so.6 \
libffi.so.8 \
osgi-com.github.jnr.jffi"

inherit rpm

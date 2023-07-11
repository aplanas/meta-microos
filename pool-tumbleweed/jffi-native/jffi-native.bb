SUMMARY = "The jffi JAR with native bits"
DESCRIPTION = "This package contains jffi JAR with native bits."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "1.3.11"

RPM_NAME = "jffi-native-1.3.11-1.2.aarch64.rpm"
RPM_HASH = "7620b8808f3948134deb17ffd153a2004296ad0e7788c134860c8db6404f13fd215fdf47e1a6109feabd049e74f016699d5d2cc1d55e828cf3578b7193d747cd"

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

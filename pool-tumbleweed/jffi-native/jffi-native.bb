SUMMARY = "The jffi JAR with native bits"
DESCRIPTION = "This package contains jffi JAR with native bits."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "1.3.11"

RPM_NAME = "jffi-native-1.3.11-1.1.aarch64.rpm"
RPM_HASH = "8e25442275f6e7d83a9b0951741a7027e9342dc8e4a2b4409ffd282001753a8cbd82b3e4fa3b7a592b8e99b7d7dfed5a9cc3a3ce0f4e6ad8fe6f21baca253a9c"

RPROVIDES:${PN} += "jffi-native \
jffi-native(aarch-64) \
libjffi-1.2.so()(64bit) \
mvn(com.github.jnr:jffi::native:) \
osgi(com.github.jnr.jffi.native)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
libc.so.6()(64bit) \
libffi.so.8()(64bit) \
osgi(com.github.jnr.jffi)"

inherit rpm

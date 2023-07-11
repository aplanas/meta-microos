SUMMARY = "OpenJDK 8 Runtime Environment with Eclipse OpenJ9"
DESCRIPTION = "The OpenJDK 8 runtime environment without audio and video support. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.362"

RPM_NAME = "java-1_8_0-openj9-headless-1.8.0.362-2.3.aarch64.rpm"
RPM_HASH = "cc4993b8f1db2775e69fb60e1134afffec670cdacb3209abba9c3b0127af756975bc5dd7e468d11637f0632e54f3e127a3921e35ffc35dbc0d97cf4f5d3f8ea1"

RPROVIDES:${PN} += "config-java-1-8-0-openj9-headless \
jaas \
java-1-8-0-openj9-headless \
java-1.8.0-headless \
java-headless \
java-openj9-headless \
java-openjdk-headless \
java-sasl \
jce \
jdbc-stdext \
jndi \
jndi-cos \
jndi-dns \
jndi-ldap \
jndi-rmi \
jre-1.8.0-headless \
jre-1.8.0-openj9-headless \
jre-1.8.0-openjdk-headless \
jre-headless \
jre-openj9-headless \
jre-openjdk-headless \
jsse \
libattach.so \
libawt-headless.so \
libawt.so \
libcuda4j29.so \
libdt-socket.so \
libfontmanager.so \
libhprof.so \
libinstrument.so \
libj2gss.so \
libj2pcsc.so \
libj2pkcs11.so \
libj9dmp29.so \
libj9gc-full29.so \
libj9gc29.so \
libj9gcchk-full29.so \
libj9gcchk29.so \
libj9hookable29.so \
libj9jextract.so \
libj9jit29.so \
libj9jnichk29.so \
libj9jvmti29.so \
libj9prt29.so \
libj9shr29.so \
libj9thr29.so \
libj9trc29.so \
libj9vm29.so \
libj9vmchk29.so \
libj9vrb-full29.so \
libj9vrb29.so \
libj9zlib29.so \
libjaas-unix.so \
libjava-crw-demo.so \
libjava.so \
libjavajpeg.so \
libjavalcms.so \
libjclse29.so \
libjdwp.so \
libjli.so \
libjncrypto.so \
libjsdt.so \
libjsig.so \
libjsound.so \
libjvm.so \
libmanagement.so \
libmlib-image.so \
libnet.so \
libnio.so \
libnpt.so \
libomrsig.so \
libsctp.so \
libsunec.so \
libunpack.so \
libverify.so \
libzip.so"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm

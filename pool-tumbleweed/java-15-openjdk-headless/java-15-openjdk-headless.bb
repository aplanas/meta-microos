SUMMARY = "OpenJDK 15 Runtime Environment"
DESCRIPTION = "The OpenJDK 15 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "15.0.10.0"

RPM_NAME = "java-15-openjdk-headless-15.0.10.0-2.3.aarch64.rpm"
RPM_HASH = "659007eb9b63f6567a849f5d310d169431fb3a810f885c515f5106ac5dc989c669b16a9e4466a3c045cde9ac510959d66d777073134243469919b5cd20b21b89"

RPROVIDES:${PN} += "config-java-15-openjdk-headless \
jaas \
java-15-headless \
java-15-openjdk-headless \
java-headless \
java-openjdk-headless \
java-sasl \
jce \
jdbc-stdext \
jndi \
jndi-cos \
jndi-dns \
jndi-ldap \
jndi-rmi \
jre-15-headless \
jre-15-openjdk-headless \
jre-headless \
jre-openjdk-headless \
jsse \
libawt-headless.so \
libawt.so \
libdt-socket.so \
libextnet.so \
libfontmanager.so \
libinstrument.so \
libj2gss.so \
libj2pcsc.so \
libj2pkcs11.so \
libjaas.so \
libjava.so \
libjavajpeg.so \
libjdwp.so \
libjimage.so \
libjli.so \
libjsig.so \
libjsound.so \
libjvm.so \
liblcms.so \
libmanagement-agent.so \
libmanagement-ext.so \
libmanagement.so \
libmlib-image.so \
libnet.so \
libnio.so \
libprefs.so \
librmi.so \
libsctp.so \
libsunec.so \
libverify.so \
libzip.so"

RDEPENDS:${PN} += "/bin/sh \
jpackage-utils \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpcsclite.so.1 \
libstdc++.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm

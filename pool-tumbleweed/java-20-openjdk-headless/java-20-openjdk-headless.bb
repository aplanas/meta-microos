SUMMARY = "OpenJDK 20 Runtime Environment"
DESCRIPTION = "The OpenJDK 20 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "20.0.1.0"

RPM_NAME = "java-20-openjdk-headless-20.0.1.0-1.2.aarch64.rpm"
RPM_HASH = "48cd4d586a4fc3153da36bb8b95f26855e1b500173220e61dc77aef0b17a9abb400d3a5c5604083257824345ceb62dbb2cfa4652d06a0c547437da5797ac05b9"

RPROVIDES:${PN} += "config-java-20-openjdk-headless \
jaas \
java-20-headless \
java-20-openjdk-headless \
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
jre-20-headless \
jre-20-openjdk-headless \
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
libsyslookup.so \
libsystemconf.so \
libverify.so \
libzip.so"

RDEPENDS:${PN} += "/usr/bin/sh \
java-ca-certificates \
jpackage-utils \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libnss3.so \
libpcsclite.so.1 \
libstdc++.so.6 \
libz.so.1 \
mozilla-nss \
rtld-GNU-HASH \
update-alternatives"

inherit rpm

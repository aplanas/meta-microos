SUMMARY = "OpenJDK 17 Runtime Environment"
DESCRIPTION = "The OpenJDK 17 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.7.0"

RPM_NAME = "java-17-openjdk-headless-17.0.7.0-3.1.aarch64.rpm"
RPM_HASH = "254c1b575c09e5ac908b9c60cf767ce5b6c15daa8bdb61feeff6f4cd537ea32db3be4fe0ee3fc60b3157ec6de5bac95f9f2a7d5319fd9784b896f506b6f09b89"

RPROVIDES:${PN} += "config-java-17-openjdk-headless \
jaas \
java-17-headless \
java-17-openjdk-headless \
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
jre-17-headless \
jre-17-openjdk-headless \
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

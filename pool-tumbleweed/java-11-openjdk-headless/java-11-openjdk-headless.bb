SUMMARY = "OpenJDK 11 Runtime Environment"
DESCRIPTION = "The OpenJDK 11 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.20.0"

RPM_NAME = "java-11-openjdk-headless-11.0.20.0-1.1.aarch64.rpm"
RPM_HASH = "5bc12a3fcc5bf85c98bff1c3cf550fae433b61f0ae3179d156071f0846ec578e6ed7497f0e4ec6011c345235d74b2d57535333d68df9522bb1a20e94586cf9e4"

RPROVIDES:${PN} += "config-java-11-openjdk-headless \
jaas \
java-10-openjdk-headless \
java-11-headless \
java-11-openjdk-headless \
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
jre-11-headless \
jre-11-openjdk-headless \
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
libsystemconf.so \
libunpack.so \
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
libharfbuzz.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libnss3.so \
libpcsclite.so.1 \
libstdc++.so.6 \
libz.so.1 \
mozilla-nss \
update-alternatives"

inherit rpm

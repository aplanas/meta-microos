SUMMARY = "OpenJDK 8 Runtime Environment"
DESCRIPTION = "The OpenJDK 8 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.372"

RPM_NAME = "java-1_8_0-openjdk-headless-1.8.0.372-1.1.aarch64.rpm"
RPM_HASH = "e88b95514f97c2f8c1e90a8a49afb7a014ff4627f596c9a57894d49a618c282a8ed1f81ee3ba4672475e64745fd5edc94fcd1a5430e88a429998f8977429454b"

RPROVIDES:${PN} += "config-java-1-8-0-openjdk-headless \
jaas \
java-1-8-0-openjdk-headless \
java-1.8.0-headless \
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
jre-1.8.0-headless \
jre-1.8.0-openjdk-headless \
jre-headless \
jre-openjdk-headless \
jsse \
libattach.so \
libawt-headless.so \
libawt.so \
libdt-socket.so \
libfontmanager.so \
libhprof.so \
libinstrument.so \
libj2gss.so \
libj2krb5.so \
libj2pcsc.so \
libj2pkcs11.so \
libj2sctp.so \
libjaas-unix.so \
libjava-crw-demo.so \
libjava.so \
libjavajpeg.so \
libjavalcms.so \
libjdwp.so \
libjli.so \
libjsdt.so \
libjsig.so \
libjsound.so \
libjvm.so \
libmanagement.so \
libmlib-image.so \
libnet.so \
libnio.so \
libnpt.so \
libsaproc.so \
libsunec.so \
libsystemconf.so \
libunpack.so \
libverify.so \
libzip.so"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libkrb5.so.3 \
liblcms2.so.2 \
libm.so.6 \
libpcsclite.so.1 \
libsctp.so.1 \
libstdc++.so.6 \
libthread-db.so.1 \
libz.so.1 \
mozilla-nss \
update-alternatives"

inherit rpm

SUMMARY = "OpenJDK 18 Runtime Environment"
DESCRIPTION = "The OpenJDK 18 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "18.0.2.0"

RPM_NAME = "java-18-openjdk-headless-18.0.2.0-4.3.aarch64.rpm"
RPM_HASH = "5c10a0197be64c086e5e4bcbd8b892c8c79decfef66f530aa086b49ce476868beab3895ad58a9b61917aaed232a7759064abbd30ca47eca07f9cfadc1edf7c1e"

RPROVIDES:${PN} += "config-java-18-openjdk-headless \
jaas \
java-18-headless \
java-18-openjdk-headless \
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
jre-18-headless \
jre-18-openjdk-headless \
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

RDEPENDS:${PN} += "/bin/sh \
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
libpcsclite.so.1 \
libstdc++.so.6 \
libz.so.1 \
mozilla-nss \
rtld-GNU-HASH \
update-alternatives"

inherit rpm

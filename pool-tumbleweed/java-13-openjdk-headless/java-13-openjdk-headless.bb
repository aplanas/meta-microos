SUMMARY = "OpenJDK 13 Runtime Environment"
DESCRIPTION = "The OpenJDK 13 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "13.0.14.0"

RPM_NAME = "java-13-openjdk-headless-13.0.14.0-2.3.aarch64.rpm"
RPM_HASH = "63e14d31ee097a42e1e92889dbfd0aea4f3dfb1fbfb1694d3048116b1ebe6893cadf014da3bbf21370f3dfb9ebb4a63c14592a23c810262d5ec0157e9406914e"

RPROVIDES:${PN} += "config-java-13-openjdk-headless \
jaas \
java-13-headless \
java-13-openjdk-headless \
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
jre-13-headless \
jre-13-openjdk-headless \
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
libunpack.so \
libverify.so \
libzip.so"

RDEPENDS:${PN} += "/usr/bin/sh \
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

SUMMARY = "OpenJDK 18 Runtime Environment"
DESCRIPTION = "The OpenJDK 18 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "18.0.2.0"

RPM_NAME = "java-18-openjdk-headless-18.0.2.0-4.3.aarch64.rpm"
RPM_HASH = "5c10a0197be64c086e5e4bcbd8b892c8c79decfef66f530aa086b49ce476868beab3895ad58a9b61917aaed232a7759064abbd30ca47eca07f9cfadc1edf7c1e"

RPROVIDES:${PN} += "config(java-18-openjdk-headless) \
jaas \
java-18-headless \
java-18-openjdk-headless \
java-18-openjdk-headless(aarch-64) \
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
libawt.so()(64bit) \
libawt_headless.so()(64bit) \
libdt_socket.so()(64bit) \
libextnet.so()(64bit) \
libfontmanager.so()(64bit) \
libinstrument.so()(64bit) \
libj2gss.so()(64bit) \
libj2pcsc.so()(64bit) \
libj2pkcs11.so()(64bit) \
libjaas.so()(64bit) \
libjava.so()(64bit) \
libjavajpeg.so()(64bit) \
libjdwp.so()(64bit) \
libjimage.so()(64bit) \
libjli.so()(64bit) \
libjsig.so()(64bit) \
libjsound.so()(64bit) \
libjvm.so()(64bit) \
liblcms.so()(64bit) \
libmanagement.so()(64bit) \
libmanagement_agent.so()(64bit) \
libmanagement_ext.so()(64bit) \
libmlib_image.so()(64bit) \
libnet.so()(64bit) \
libnio.so()(64bit) \
libprefs.so()(64bit) \
librmi.so()(64bit) \
libsctp.so()(64bit) \
libsyslookup.so()(64bit) \
libsystemconf.so()(64bit) \
libverify.so()(64bit) \
libzip.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
java-ca-certificates \
jpackage-utils \
ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libpcsclite.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
mozilla-nss \
rtld(GNU_HASH) \
update-alternatives"

inherit rpm

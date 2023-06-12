SUMMARY = "OpenJDK 11 Runtime Environment"
DESCRIPTION = "The OpenJDK 11 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.19.0"

RPM_NAME = "java-11-openjdk-headless-11.0.19.0-1.1.aarch64.rpm"
RPM_HASH = "84c837b337568f18b78f7deecb647feef2a1d93f93a7032755edc76f91566b16ea4d3a079ab3ccad7ac9c7f29f4ebd2ed83b92b4eb08d2d654e4c1ebe64085ec"

RPROVIDES:${PN} += "config(java-11-openjdk-headless) \
jaas \
java-10-openjdk-headless \
java-11-headless \
java-11-openjdk-headless \
java-11-openjdk-headless(aarch-64) \
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
libjvm.so(SUNWprivate_1.1)(64bit) \
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
libsunec.so()(64bit) \
libsystemconf.so()(64bit) \
libunpack.so()(64bit) \
libverify.so()(64bit) \
libzip.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
java-ca-certificates \
jpackage-utils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libharfbuzz.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnss3.so()(64bit) \
libnss3.so(NSS_3.53)(64bit) \
libpcsclite.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libz.so.1(ZLIB_1.2.2)(64bit) \
mozilla-nss \
update-alternatives"

inherit rpm

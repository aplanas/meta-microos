SUMMARY = "OpenJDK 11 Runtime Environment with Eclipse OpenJ9"
DESCRIPTION = "The OpenJDK 11 runtime environment without audio and video support. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "11.0.18.0"

RPM_NAME = "java-11-openj9-headless-11.0.18.0-2.1.aarch64.rpm"
RPM_HASH = "20a626f365efafd1b7fc3e1efd9ffcbc206bba45a60cc6e6c6ab39ba91373c24beb42000d52a8169c15467167d558d31db2be58f7192518a54c9d5ce8ed3dbf0"

RPROVIDES:${PN} += "config(java-11-openj9-headless) \
jaas \
java-11-headless \
java-11-openj9-headless \
java-11-openj9-headless(aarch-64) \
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
jre-11-headless \
jre-11-openj9-headless \
jre-11-openjdk-headless \
jre-headless \
jre-openj9-headless \
jre-openjdk-headless \
jsse \
libawt.so()(64bit) \
libawt_headless.so()(64bit) \
libcuda4j29.so()(64bit) \
libdt_socket.so()(64bit) \
libextnet.so()(64bit) \
libfontmanager.so()(64bit) \
libinstrument.so()(64bit) \
libj2gss.so()(64bit) \
libj2pcsc.so()(64bit) \
libj2pkcs11.so()(64bit) \
libj9dmp29.so()(64bit) \
libj9gc29.so()(64bit) \
libj9gc_full29.so()(64bit) \
libj9gcchk29.so()(64bit) \
libj9gcchk_full29.so()(64bit) \
libj9hookable29.so()(64bit) \
libj9jextract.so()(64bit) \
libj9jit29.so()(64bit) \
libj9jnichk29.so()(64bit) \
libj9jvmti29.so()(64bit) \
libj9prt29.so()(64bit) \
libj9shr29.so()(64bit) \
libj9thr29.so()(64bit) \
libj9trc29.so()(64bit) \
libj9vm29.so()(64bit) \
libj9vmchk29.so()(64bit) \
libj9vrb29.so()(64bit) \
libj9vrb_full29.so()(64bit) \
libj9zlib29.so()(64bit) \
libjaas.so()(64bit) \
libjava.so()(64bit) \
libjavajpeg.so()(64bit) \
libjclse29.so()(64bit) \
libjdwp.so()(64bit) \
libjimage.so()(64bit) \
libjli.so()(64bit) \
libjncrypto.so()(64bit) \
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
libomrsig.so()(64bit) \
libprefs.so()(64bit) \
librmi.so()(64bit) \
libsctp.so()(64bit) \
libsunec.so()(64bit) \
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
libc.so.6(GLIBC_2.36)(64bit) \
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
libpcsclite.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libz.so.1(ZLIB_1.2.2)(64bit) \
update-alternatives"

inherit rpm

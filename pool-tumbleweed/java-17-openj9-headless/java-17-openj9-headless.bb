SUMMARY = "OpenJDK 17 Runtime Environment with Eclipse OpenJ9"
DESCRIPTION = "The OpenJDK 17 runtime environment without audio and video support. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "17.0.6.0"

RPM_NAME = "java-17-openj9-headless-17.0.6.0-2.1.aarch64.rpm"
RPM_HASH = "54bb7365aded7494a0cf41f5cb0785fafd560c79bf9e9e936dc82baa33d658d1bab5b80de24bf1bb3143e7bb870554ddd428a961e4c090ce38b9864211143177"

RPROVIDES:${PN} += "config(java-17-openj9-headless) \
jaas \
java-17-headless \
java-17-openj9-headless \
java-17-openj9-headless(aarch-64) \
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
jre-17-headless \
jre-17-openj9-headless \
jre-17-openjdk-headless \
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
libsyslookup.so()(64bit) \
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
libharfbuzz.so.0()(64bit) \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libpcsclite.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
update-alternatives"

inherit rpm

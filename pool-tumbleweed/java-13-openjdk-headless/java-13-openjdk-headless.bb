SUMMARY = "OpenJDK 13 Runtime Environment"
DESCRIPTION = "The OpenJDK 13 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "13.0.14.0"

RPM_NAME = "java-13-openjdk-headless-13.0.14.0-2.3.aarch64.rpm"
RPM_HASH = "63e14d31ee097a42e1e92889dbfd0aea4f3dfb1fbfb1694d3048116b1ebe6893cadf014da3bbf21370f3dfb9ebb4a63c14592a23c810262d5ec0157e9406914e"

RPROVIDES:${PN} += "config(java-13-openjdk-headless) \
jaas \
java-13-headless \
java-13-openjdk-headless \
java-13-openjdk-headless(aarch-64) \
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
libunpack.so()(64bit) \
libverify.so()(64bit) \
libzip.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
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
libgcc_s.so.1(GCC_4.0.0)(64bit) \
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
update-alternatives"

inherit rpm

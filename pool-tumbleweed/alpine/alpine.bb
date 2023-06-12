SUMMARY = "Mail User Agent"
DESCRIPTION = "Alpine is a display-oriented email client that is suitable for both \
the inexperienced email user as well as for the most demanding of \
power users. Alpine is based on the Pine® Message System, which was \
also developed at the University of Washington. Alpine can be learned \
by exploration and the use of context-sensitive help. The user \
experience is highly customizable through the use of the Alpine Setup \
command."
LICENSE = "Apache-2.0"

PV = "2.26"

RPM_NAME = "alpine-2.26-27.4.aarch64.rpm"
RPM_HASH = "2fe1d6763f67fe089fe43560f5970ba44070ff00336389b745417247960c6db410f0af763ee80c11d11d19a6cf7dcc5849513108765e9ee281936b682c443521"

RPROVIDES:${PN} += "alpine \
alpine(aarch-64) \
application() \
application(alpine.desktop) \
pine \
pine4"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm

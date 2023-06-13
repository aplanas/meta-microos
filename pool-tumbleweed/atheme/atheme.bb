SUMMARY = "Extensible IRC services"
DESCRIPTION = "Atheme is a set of modular IRC services (NickServ, ChanServ, etc.) \
designed to link with more than 20 kinds of IRCds. \
Atheme offers both an C API and a Perl interface."
LICENSE = "MIT"

PV = "7.2.12"

RPM_NAME = "atheme-7.2.12-2.9.aarch64.rpm"
RPM_HASH = "d857305a3e841ca610e29edf77a2a58d28271358b6b3428f5d369b18a45fdd39389a2f9b12ef835a843a261edbcfd7698c3508f298d61282f07889fee82eac05"

RPROVIDES:${PN} += "atheme \
atheme(aarch-64) \
config(atheme)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libathemecore.so.1()(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrack.so.2()(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmowgli-2.so.0()(64bit) \
libmowgli-2.so.0(V_2.1.3)(64bit) \
shadow"

inherit rpm

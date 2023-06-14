SUMMARY = "Extensible IRC services"
DESCRIPTION = "Atheme is a set of modular IRC services (NickServ, ChanServ, etc.) \
designed to link with more than 20 kinds of IRCds. \
Atheme offers both an C API and a Perl interface."
LICENSE = "MIT"

PV = "7.2.12"

RPM_NAME = "atheme-7.2.12-2.9.aarch64.rpm"
RPM_HASH = "d857305a3e841ca610e29edf77a2a58d28271358b6b3428f5d369b18a45fdd39389a2f9b12ef835a843a261edbcfd7698c3508f298d61282f07889fee82eac05"

RPROVIDES:${PN} += "atheme \
config-atheme"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libathemecore.so.1 \
libc.so.6 \
libcrack.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libldap.so.2 \
libm.so.6 \
libmowgli-2.so.0 \
shadow"

inherit rpm

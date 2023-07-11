SUMMARY = "Extensible IRC services"
DESCRIPTION = "Atheme is a set of modular IRC services (NickServ, ChanServ, etc.) \
designed to link with more than 20 kinds of IRCds. \
Atheme offers both an C API and a Perl interface."
LICENSE = "MIT"

PV = "7.2.12"

RPM_NAME = "atheme-7.2.12-2.10.aarch64.rpm"
RPM_HASH = "577833044bbda8a2c4c6b0a366516d6137fee2ea1ee235296483b3afa0dcfa0c84ea5e19b2587d98b0ed98fcc319aaa2ba7dc6026278ec1472047ebb62e8591d"

RPROVIDES:${PN} += "atheme \
config-atheme"

RDEPENDS:${PN} += "/usr/bin/sh \
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

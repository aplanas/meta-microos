SUMMARY = "The Atheme IRC Services core library"
DESCRIPTION = "Atheme is a set of modular IRC services (NickServ, ChanServ, etc.) \
designed to link with many kinds of IRCds."
LICENSE = "MIT"

PV = "7.2.12"

RPM_NAME = "libathemecore1-7.2.12-2.9.aarch64.rpm"
RPM_HASH = "85892cdfba45715c06641f508c6e3a3a1a9a388ba3ac94f2ff0448e8b36d6747b07e556fbab4a25131fc5a5410dd644acbc841505f31579b69ff1c619b325de5"

RPROVIDES:${PN} += "libathemecore.so.1()(64bit) \
libathemecore1 \
libathemecore1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libmowgli-2.so.0()(64bit) \
libmowgli-2.so.0(V_2.1.3)(64bit) \
libpcre.so.1()(64bit) \
libqrencode.so.4()(64bit)"

inherit rpm

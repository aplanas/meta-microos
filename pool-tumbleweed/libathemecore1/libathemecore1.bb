SUMMARY = "The Atheme IRC Services core library"
DESCRIPTION = "Atheme is a set of modular IRC services (NickServ, ChanServ, etc.) \
designed to link with many kinds of IRCds."
LICENSE = "MIT"

PV = "7.2.12"

RPM_NAME = "libathemecore1-7.2.12-2.10.aarch64.rpm"
RPM_HASH = "0711028fb13fe988dc32fc2fec079e971aba5473d77da7998e58231e4facc5dbcd77abb7e0d284e257a029967627a43821039971bbda35f3900adfcc3d6a6984"

RPROVIDES:${PN} += "libathemecore.so.1 \
libathemecore1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmowgli-2.so.0 \
libpcre.so.1 \
libqrencode.so.4"

inherit rpm

SUMMARY = "Communications server for Jabber/XMPP"
DESCRIPTION = "Prosody is a communications server for Jabber/XMPP written in Lua. \
 \
Prosody can link up with other Prosody installations and other \
XMPP-compatible services to form an open communication network, \
whilst allowing control over who they connect to, and who they share \
data with."
LICENSE = "MIT"

PV = "0.12.3"

RPM_NAME = "prosody-0.12.3-1.3.aarch64.rpm"
RPM_HASH = "224c59c17d0756b74119233915289a8c2349aa8306a46446dc6d60001da9b48d3f3ec6c5c8db0823feb5bc23ac797dfa8f5a6c12eedd216c263ec3bb692eb472"

RPROVIDES:${PN} += "config-prosody \
prosody"

RDEPENDS:${PN} += "/usr/bin/lua5.1 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libicui18n.so.73 \
libicuuc.so.73 \
lua51 \
lua51-BitOp \
lua51-luaexpat \
lua51-luafilesystem \
lua51-luasec \
lua51-luasocket \
permissions \
shadow \
systemd"

inherit rpm

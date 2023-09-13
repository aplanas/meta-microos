SUMMARY = "Communications server for Jabber/XMPP"
DESCRIPTION = "Prosody is a communications server for Jabber/XMPP written in Lua. \
 \
Prosody can link up with other Prosody installations and other \
XMPP-compatible services to form an open communication network, \
whilst allowing control over who they connect to, and who they share \
data with."
LICENSE = "MIT"

PV = "0.12.4"

RPM_NAME = "prosody-0.12.4-1.1.aarch64.rpm"
RPM_HASH = "e8a458a2561d93ceacb29551d3d9041c4feec24299895700ddcb3227a0a259ce5fb71c849fb72371facaff36bb3c7d9a30aba5184b860591b46d9574a0adad43"

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

SUMMARY = "XMPP Client for the Console"
DESCRIPTION = "Poezio is a console-based client for XMPP, the protocol on which the \
Jabber IM network is built. The network can be conneced to without \
having to create an account and join various chatrooms immediately. \
The client tries to look similar to the weechat/irssi IRC clients and \
many commands are identical. Configuration can be done in a \
configuration file or directly from the client."
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "poezio-0.14-1.4.aarch64.rpm"
RPM_HASH = "0ee2ff5a735b884dcc3625b255bdd67c2e1682110ceeffba262b43a1b073719c03ad20bb9cd2163aadbeda00cbc44e227d681e0209d015d5e14d475e89ce18cb"

RPROVIDES:${PN} += "poezio \
python3.11dist-poezio \
python3dist-poezio"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-aiodns \
python3-curses \
python3-pyasn1-modules \
python3-setuptools \
python3-slixmpp"

inherit rpm

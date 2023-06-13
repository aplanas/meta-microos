SUMMARY = "XMPP Client for the Console"
DESCRIPTION = "Poezio is a console-based client for XMPP, the protocol on which the \
Jabber IM network is built. The network can be conneced to without \
having to create an account and join various chatrooms immediately. \
The client tries to look similar to the weechat/irssi IRC clients and \
many commands are identical. Configuration can be done in a \
configuration file or directly from the client."
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "poezio-0.14-1.3.aarch64.rpm"
RPM_HASH = "f72f55db5555bad1c64c91939ce21efc8001c4b564fae6bdd69b7c5259a8c854cac0b9f15937fa371c7348aadae6c88ff3fd8b23a27af83e56be8e0b80b0236e"

RPROVIDES:${PN} += "application() \
application(io.poez.Poezio.desktop) \
metainfo() \
metainfo(io.poez.Poezio.appdata.xml) \
poezio \
poezio(aarch-64) \
python3.10dist(poezio) \
python3dist(poezio)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python3-aiodns \
python3-curses \
python3-pyasn1-modules \
python3-setuptools \
python3-slixmpp"

inherit rpm

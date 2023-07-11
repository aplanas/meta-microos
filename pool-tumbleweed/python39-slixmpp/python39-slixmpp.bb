SUMMARY = "Python XMPP (Jabber) Library that Implements Everything as a Plugin"
DESCRIPTION = "Slixmpp is an XMPP library for Python. Based on SleekXMPP, it uses \
asyncio instead of threads. XEP (XMPP Extended Protocol) coverage is \
realized as plugins."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "python39-slixmpp-1.8.3-1.7.aarch64.rpm"
RPM_HASH = "fc602f119908a5fbb2d48c530411629624ca0d79b97a813404b8fd83e9d96398e56f8b83e9c4a93463ef014846103476e0d66dc64f3bf29ebdb0c6ac18c5e48e"

RPROVIDES:${PN} += "python3.9dist-slixmpp \
python39-slixmpp \
python3dist-slixmpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn.so.12 \
python-abi \
python39-aiohttp \
python39-dnspython"

inherit rpm

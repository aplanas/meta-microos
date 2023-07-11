SUMMARY = "Python XMPP (Jabber) Library that Implements Everything as a Plugin"
DESCRIPTION = "Slixmpp is an XMPP library for Python. Based on SleekXMPP, it uses \
asyncio instead of threads. XEP (XMPP Extended Protocol) coverage is \
realized as plugins."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "python311-slixmpp-1.8.3-1.7.aarch64.rpm"
RPM_HASH = "00aff5a1fd2b9d83c34647b2748cd29087a90311095c3e6e87ac8d9e74d3c6e7f15878a02793f36dbf8e103afbf5104e923a7b085485701225e06466abef7cee"

RPROVIDES:${PN} += "python3-slixmpp \
python3.11dist-slixmpp \
python311-slixmpp \
python3dist-slixmpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn.so.12 \
python-abi \
python311-aiohttp \
python311-dnspython"

inherit rpm

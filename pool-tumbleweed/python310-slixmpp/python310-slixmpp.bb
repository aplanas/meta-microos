SUMMARY = "Python XMPP (Jabber) Library that Implements Everything as a Plugin"
DESCRIPTION = "Slixmpp is an XMPP library for Python. Based on SleekXMPP, it uses \
asyncio instead of threads. XEP (XMPP Extended Protocol) coverage is \
realized as plugins."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "python310-slixmpp-1.8.3-1.7.aarch64.rpm"
RPM_HASH = "83d6a86f4b0d0aa9e2d764b4455cc6ec189a734fb1293002a3aef87d51e7aa6a6d413cc989256ccfe3c68b943edfeb1c5b41e70a17b8d82324e9a5f4c2dfecfb"

RPROVIDES:${PN} += "python3.10dist-slixmpp \
python310-slixmpp \
python3dist-slixmpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn.so.12 \
python-abi \
python310-aiohttp \
python310-dnspython"

inherit rpm

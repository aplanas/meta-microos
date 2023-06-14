SUMMARY = "Python XMPP (Jabber) Library that Implements Everything as a Plugin"
DESCRIPTION = "Slixmpp is an XMPP library for Python. Based on SleekXMPP, it uses \
asyncio instead of threads. XEP (XMPP Extended Protocol) coverage is \
realized as plugins."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "python311-slixmpp-1.8.3-1.5.aarch64.rpm"
RPM_HASH = "20e75e83f7ded8c1a61bc47db05bda3375bff8741d96a0d772fa685d5735d0d3b5c127c2085142cf80e367365cbf92d7487191175f780aadba8016a2953c087d"

RPROVIDES:${PN} += "python3.11dist-slixmpp \
python311-slixmpp \
python3dist-slixmpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn.so.12 \
python-abi \
python311-aiohttp \
python311-dnspython"

inherit rpm

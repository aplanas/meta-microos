SUMMARY = "Python XMPP (Jabber) Library that Implements Everything as a Plugin"
DESCRIPTION = "Slixmpp is an XMPP library for Python. Based on SleekXMPP, it uses \
asyncio instead of threads. XEP (XMPP Extended Protocol) coverage is \
realized as plugins."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "python39-slixmpp-1.8.3-1.5.aarch64.rpm"
RPM_HASH = "0425e97e971bda7c31f7259d18be3a38e3d9698e15b6bcb45e2bc608affc9ca8a6274729c030b20da2d4570575341c2c8b755054eb20403ed0a1e5de7863e138"

RPROVIDES:${PN} += "python3.9dist(slixmpp) \
python39-slixmpp \
python39-slixmpp(aarch-64) \
python3dist(slixmpp)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libidn.so.12()(64bit) \
python(abi) \
python39-aiohttp \
python39-dnspython"

inherit rpm

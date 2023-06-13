SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "Proxies are special objects which serve as mostly-transparent wrappers around \
another object, intervening in the apparent behavior of the wrapped object only \
when necessary to apply the policy (e.g., access checking, location brokering, \
etc.) for which the proxy is responsible."
LICENSE = "ZPL-2.1"

PV = "4.6.1"

RPM_NAME = "python311-zope.proxy-4.6.1-1.4.aarch64.rpm"
RPM_HASH = "0d9193d33072944093e19cb89ede9d3ae710956f1e6056c6f307b520d4b82a804492055ecf54578df8910d0f4ab772f360ca880478bb2cac840fc68663e1a1c3"

RPROVIDES:${PN} += "python3.11dist(zope.proxy) \
python311-zope.proxy \
python311-zope.proxy(aarch-64) \
python3dist(zope.proxy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python311-zope.interface"

inherit rpm

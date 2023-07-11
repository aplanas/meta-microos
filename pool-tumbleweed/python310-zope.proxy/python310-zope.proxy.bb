SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "Proxies are special objects which serve as mostly-transparent wrappers around \
another object, intervening in the apparent behavior of the wrapped object only \
when necessary to apply the policy (e.g., access checking, location brokering, \
etc.) for which the proxy is responsible."
LICENSE = "ZPL-2.1"

PV = "4.6.1"

RPM_NAME = "python310-zope.proxy-4.6.1-2.3.aarch64.rpm"
RPM_HASH = "6d5613c3269d79181acbd48d39fbfb35812e5fbd61cfd662d39f6a0c4579db8adb208e7ddd79ee652fbd730dfd6312986d5c96494d7452b5480bee7417d5b4a2"

RPROVIDES:${PN} += "python3.10dist-zope.proxy \
python310-zope.proxy \
python3dist-zope.proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-zope.interface"

inherit rpm

SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "Proxies are special objects which serve as mostly-transparent wrappers around \
another object, intervening in the apparent behavior of the wrapped object only \
when necessary to apply the policy (e.g., access checking, location brokering, \
etc.) for which the proxy is responsible."
LICENSE = "ZPL-2.1"

PV = "4.6.1"

RPM_NAME = "python39-zope.proxy-4.6.1-2.3.aarch64.rpm"
RPM_HASH = "f96919b00682120d6be51884e48fce39017d2a6da9fc2ecc86707754523ebff2a5becb80ec7bde9a54217fbd5e777526927c56bf39fee3ec9fd7402566671861"

RPROVIDES:${PN} += "python3.9dist-zope.proxy \
python39-zope.proxy \
python3dist-zope.proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-zope.interface"

inherit rpm

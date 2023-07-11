SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "Proxies are special objects which serve as mostly-transparent wrappers around \
another object, intervening in the apparent behavior of the wrapped object only \
when necessary to apply the policy (e.g., access checking, location brokering, \
etc.) for which the proxy is responsible."
LICENSE = "ZPL-2.1"

PV = "4.6.1"

RPM_NAME = "python311-zope.proxy-4.6.1-2.3.aarch64.rpm"
RPM_HASH = "404363e7812d529fdd55591604f77ae9f5b6be369985fc9a36cc1152423c210862d37a27b03c1492e464e0da256e983dd983293313460745b6cabfc7d229d7b5"

RPROVIDES:${PN} += "python3-zope.proxy \
python3.11dist-zope.proxy \
python311-zope.proxy \
python3dist-zope.proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-zope.interface"

inherit rpm

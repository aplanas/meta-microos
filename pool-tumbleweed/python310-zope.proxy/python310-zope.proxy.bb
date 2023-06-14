SUMMARY = "Generic Transparent Proxies"
DESCRIPTION = "Proxies are special objects which serve as mostly-transparent wrappers around \
another object, intervening in the apparent behavior of the wrapped object only \
when necessary to apply the policy (e.g., access checking, location brokering, \
etc.) for which the proxy is responsible."
LICENSE = "ZPL-2.1"

PV = "4.6.1"

RPM_NAME = "python310-zope.proxy-4.6.1-1.4.aarch64.rpm"
RPM_HASH = "d82e6377fe294ced80b92422eb74469c543805ec36fc49422a0406ccea935e545a1faae0365c2c3cb89f452e4d6408ce5485382920a34f5c22b60b4656263b04"

RPROVIDES:${PN} += "python3-zope.proxy \
python3.10dist-zope.proxy \
python310-zope.proxy \
python3dist-zope.proxy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-zope.interface"

inherit rpm

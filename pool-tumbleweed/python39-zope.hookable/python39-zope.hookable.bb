SUMMARY = "Zope hookable"
DESCRIPTION = "Hookable object support. \
 \
Support the efficient creation of hookable objects, which are callable objects \
that are meant to be replaced by other callables, at least optionally. \
 \
The idea is you create a function that does some default thing and make it \
hookable. Later, someone can modify what it does by calling its sethook method \
and changing its implementation. All users of the function, including those \
that imported it, will see the change."
LICENSE = "ZPL-2.1"

PV = "5.4"

RPM_NAME = "python39-zope.hookable-5.4-3.1.aarch64.rpm"
RPM_HASH = "6fa5e68c3736275c06a4668d3b2deb5e1573553e4cb565a20694985d83d4f9bebb20d6544471684b46b24f654ee85e849eaafd34a8331d932b5aa5d75fb13b64"

RPROVIDES:${PN} += "python3.9dist(zope.hookable) \
python39-zope.hookable \
python39-zope.hookable(aarch-64) \
python3dist(zope.hookable)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm

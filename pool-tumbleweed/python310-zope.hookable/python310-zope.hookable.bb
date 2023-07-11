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

RPM_NAME = "python310-zope.hookable-5.4-4.3.aarch64.rpm"
RPM_HASH = "91513aa1478459a0f7ccd528b81f0dcf76f5c7ab9d6760c31991c145494a522bfadc49eee707d36561be3ac101d36835a0365f6cebfeaaf82b7061d1b982c371"

RPROVIDES:${PN} += "python3.10dist-zope.hookable \
python310-zope.hookable \
python3dist-zope.hookable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

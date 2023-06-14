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

RPM_NAME = "python310-zope.hookable-5.4-3.1.aarch64.rpm"
RPM_HASH = "e361a6c1bd90ff3967de2e00e3ac0b62fea0ab17a13b0928bcee4a7a6cb5b7ba5cbd3dbaca7de36a5c7df3f4851ba2e40859c4858cfc3025c841a605b4098833"

RPROVIDES:${PN} += "python3-zope.hookable \
python3.10dist-zope.hookable \
python310-zope.hookable \
python3dist-zope.hookable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

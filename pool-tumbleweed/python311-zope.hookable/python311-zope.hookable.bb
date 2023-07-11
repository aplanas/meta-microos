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

RPM_NAME = "python311-zope.hookable-5.4-4.3.aarch64.rpm"
RPM_HASH = "e4343edda91ae84311cf1b7a6568ecbc430f74124203a2808058876189a7ab5609d1825947ab309587f49a69a17f7e018dd5f4ad834c96a8b06493c6e0b5148d"

RPROVIDES:${PN} += "python3-zope.hookable \
python3.11dist-zope.hookable \
python311-zope.hookable \
python3dist-zope.hookable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

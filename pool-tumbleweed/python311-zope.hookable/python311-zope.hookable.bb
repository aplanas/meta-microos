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

RPM_NAME = "python311-zope.hookable-5.4-5.1.aarch64.rpm"
RPM_HASH = "b6c8ba4c14c1301072ca9e6767212641e3ded09177592f82899d5f3e0fd5686c0d9d6e0576e10f82043539c78a860a96f4f3113b4798604b1c8f42c225bf6d04"

RPROVIDES:${PN} += "python3-zope.hookable \
python3.11dist-zope.hookable \
python311-zope.hookable \
python3dist-zope.hookable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

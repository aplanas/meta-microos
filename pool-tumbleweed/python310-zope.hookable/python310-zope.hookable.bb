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

RPM_NAME = "python310-zope.hookable-5.4-5.1.aarch64.rpm"
RPM_HASH = "9d299d01ac48ff47992634b4d6d58c816c0c3c58699b0651bcea2b09d9b6c320692e8a149418803eb83968a3d0c21ea98b128d6783eb6d33d47db054520bff61"

RPROVIDES:${PN} += "python3.10dist-zope.hookable \
python310-zope.hookable \
python3dist-zope.hookable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

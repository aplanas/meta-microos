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

RPM_NAME = "python39-zope.hookable-5.4-4.3.aarch64.rpm"
RPM_HASH = "73d86e104afea78016696fcb326a9769e0e4daa875ba78eb3b343bda4d6ac7cdbe6f803d3919125a3c55694c1a19ed5b1f67b0e3f24b7b82c5984cac83cfedfa"

RPROVIDES:${PN} += "python3.9dist-zope.hookable \
python39-zope.hookable \
python3dist-zope.hookable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

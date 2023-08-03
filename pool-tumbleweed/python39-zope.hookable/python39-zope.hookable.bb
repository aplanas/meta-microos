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

RPM_NAME = "python39-zope.hookable-5.4-5.1.aarch64.rpm"
RPM_HASH = "7ed4ddc27f7bfad0bdf087a38018c77db320eca5197d64218a825441d96387a469e0a843642d7c7755c4f20355b0f0eebc7287e14d04b99ce830f1b470a18e5b"

RPROVIDES:${PN} += "python3.9dist-zope.hookable \
python39-zope.hookable \
python3dist-zope.hookable"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

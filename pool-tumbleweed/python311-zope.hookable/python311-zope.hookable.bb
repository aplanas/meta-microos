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

RPM_NAME = "python311-zope.hookable-5.4-3.1.aarch64.rpm"
RPM_HASH = "5f51a9b2ea6c762df5ac76ec44c85d17fe35f671f801607f24f7ea5f03b70259162a1c062ca419d9379e1cc9b1ed3397641d9efd1b453deb4b3a37189809aad6"

RPROVIDES:${PN} += "python3.11dist(zope.hookable) \
python311-zope.hookable \
python311-zope.hookable(aarch-64) \
python3dist(zope.hookable)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm

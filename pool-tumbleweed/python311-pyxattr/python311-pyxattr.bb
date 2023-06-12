SUMMARY = "Filesystem extended attributes for python"
DESCRIPTION = "This is a C extension module for Python which \
implements extended attributes manipulation. It is a wrapper on top \
of the attr C library - see attr(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "python311-pyxattr-0.7.2-1.13.aarch64.rpm"
RPM_HASH = "90eac8cdf43f5eb5b8f6b087edcca8a4faf69c09acd125ba148a41319ad99007bd3f897b7868cea8e5eaabb66a6fc9b00fd59cea8ef5cb961306fa46e4b678d4"

RPROVIDES:${PN} += "python3.11dist(pyxattr) \
python311-pyxattr \
python311-pyxattr(aarch-64) \
python3dist(pyxattr)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm

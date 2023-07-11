SUMMARY = "Library for Capabilities (linux-privs) Support"
DESCRIPTION = "Capabilities are a measure to limit the omnipotence of the superuser. \
Currently a program started by root or setuid root has the power to do \
anything. Capabilities (Linux-Privs) provide a more fine-grained access \
control. Without kernel patches, you can use this library to drop \
capabilities within setuid binaries. If you use patches, this can be \
done automatically by the kernel."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.69"

RPM_NAME = "libpsx2-2.69-1.2.aarch64.rpm"
RPM_HASH = "d3db71ccd262fbe6520df7a9e10d8cb8e53a4b24b0d5c1e92560b5da7f92e9bb7bae85ad38296614e9a0089acf7eb041a5e3e85145c0dfdae1cf12ae0c4c20ff"

RPROVIDES:${PN} += "libpsx.so.2 \
libpsx2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

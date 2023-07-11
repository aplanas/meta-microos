SUMMARY = "Library with functions commonly found on BSD systems"
DESCRIPTION = "This library provides functions commonly found on BSD systems, and \
lacking on others like GNU systems, thus making it easier to port projects \
with strong BSD origins, without needing to embed the same code over and \
over again on each project."
LICENSE = "BSD-3-Clause"

PV = "0.11.7"

RPM_NAME = "libbsd0-0.11.7-2.2.aarch64.rpm"
RPM_HASH = "8fa7f08238a44ad5b7f4c9ba1076b8dc75bd5ed89ed819accb66afc3f47ad1eb44bfd8d8d044e39b022cd14882d67a79b968db8b01525ff4e0adf9934d2ba295"

RPROVIDES:${PN} += "libbsd.so.0 \
libbsd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmd.so.0"

inherit rpm

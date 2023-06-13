SUMMARY = "Lightweight implementation of DNF in C"
DESCRIPTION = "Micro DNF is a lightweight C implementation of DNF, designed to be used \
for doing simple packaging actions when you don't need full-blown DNF and \
you want the tiniest useful environments possible. \
 \
That is, you don't want any interpreter stack and you want the most \
minimal environment possible so you can build up to exactly what you need."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.1"

RPM_NAME = "microdnf-3.9.1-1.4.aarch64.rpm"
RPM_HASH = "d61a534a687dfe2bee0ebacd311f78742e3b6ff927cf35604311de06002e955b65f74f2099ff1039c2ef5dd5b6f069268d985069771f3e57371d4272d6fddb62"

RPROVIDES:${PN} += "microdnf \
microdnf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdnf.so.2()(64bit) \
libdnf2 \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
librpmio.so.9()(64bit) \
libsmartcols.so.1()(64bit) \
libsmartcols.so.1(SMARTCOLS_2.25)(64bit) \
libsmartcols.so.1(SMARTCOLS_2.29)(64bit)"

inherit rpm

SUMMARY = "Lightweight implementation of DNF in C"
DESCRIPTION = "Micro DNF is a lightweight C implementation of DNF, designed to be used \
for doing simple packaging actions when you don't need full-blown DNF and \
you want the tiniest useful environments possible. \
 \
That is, you don't want any interpreter stack and you want the most \
minimal environment possible so you can build up to exactly what you need."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.1"

RPM_NAME = "microdnf-3.9.1-1.5.aarch64.rpm"
RPM_HASH = "06695a72570c3aed19f01ebb53aa6c21abfedc3bc311ff560a216958710fb64772042f407aff4153a366a2226b90857bb77b20f29aa971f91386c75da84394c7"

RPROVIDES:${PN} += "microdnf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf.so.2 \
libdnf2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpeas-1.0.so.0 \
librpmio.so.9 \
libsmartcols.so.1"

inherit rpm

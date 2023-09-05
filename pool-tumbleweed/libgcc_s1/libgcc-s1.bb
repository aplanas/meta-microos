SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libgcc_s1-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "3f369a31ea90311a7456aa0fa2a372a5222ca1e07104fa9dacfded11e0aeda8a7fe3e7fe12a8090cc025d0e5281ebd5e80d8738ee2f00f9f4e2ad53361f2c1bf"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm

SUMMARY = "Header files for libdict"
DESCRIPTION = "Development and header files for libdict."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "libdict-devel-1.0.1-1.3.aarch64.rpm"
RPM_HASH = "d289398f52e106bdd653f896233172d2b56b9a85b6a406a44c8fe514129dd459e917c1e8fdc41616d148d20573be299bf97f3e6590ed910072495513c9f415ab"

RPROVIDES:${PN} += "libdict-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdict.so.1.0 \
libdict1-0"

inherit rpm

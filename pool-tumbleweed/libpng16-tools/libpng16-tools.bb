SUMMARY = "Tools for Manipulating PNG Images"
DESCRIPTION = "Package consists of low level tools for manipulating and fixing particular \
PNG files."
LICENSE = "libpng-2.0"

PV = "1.6.40"

RPM_NAME = "libpng16-tools-1.6.40-1.1.aarch64.rpm"
RPM_HASH = "a006708ef40bb4e28ef84b404ad981f0ea3882540ff269a93263f2f1ac43da296e9c07feb5ec5f1715bbe5c528aab501661ef7f61e4207cae05569b29fee09d3"

RPROVIDES:${PN} += "libpng-tools \
libpng16-tools \
rpm-macro-png-fix \
rpm-macro-png-fix-dir"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm

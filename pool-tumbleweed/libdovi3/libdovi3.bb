SUMMARY = "Library to read & write Dolby Vision metadata"
DESCRIPTION = "Library to read & write Dolby Vision metadata"
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "libdovi3-3.1.2-2.1.aarch64.rpm"
RPM_HASH = "fd3ceb9c42e61d2bfafd138ea477d1b0fd3949d09c7d1f8965f15cc81071792d562b2114b42d9f81575eca1fd0eb8554951f2bbc2b5748497a1c9ae37bf48cc4"

RPROVIDES:${PN} += "libdovi.so.3()(64bit) \
libdovi3 \
libdovi3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm

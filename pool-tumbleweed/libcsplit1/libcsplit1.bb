SUMMARY = "Library for C split string functions"
DESCRIPTION = "Library for C split string functions. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220109"

RPM_NAME = "libcsplit1-20220109-3.3.aarch64.rpm"
RPM_HASH = "aa431a5fc2baed09c48d5db28f7cb09b8d2278856fe3eae1f419c01d2ccbcfc535018cbf61168c92058be7f63c42da86f2c5625b31df963479b9ba3b69f0dc24"

RPROVIDES:${PN} += "libcsplit.so.1 \
libcsplit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm

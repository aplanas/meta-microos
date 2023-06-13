SUMMARY = "Shared library from libs3"
DESCRIPTION = "This package includes the libs3 shared object library, needed to run \
applications compiled against libs3, and additionally contains the s3 \
utility for accessing Amazon S3."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "4.1.git277"

RPM_NAME = "libs3-4-4.1.git277-1.15.aarch64.rpm"
RPM_HASH = "e0ef9361323e5962fc38d1143c91d009e50eafe7d5c999265407ce634770d076fed4361c4b0e49d9d0e702dac02281fc9df913033f16e8cfbc227d53a1efcbbd"

RPROVIDES:${PN} += "libs3-4 \
libs3-4(aarch-64) \
libs3.so.4()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm

SUMMARY = "Tools for wcslib"
DESCRIPTION = "This package contains tools for working with files created or \
opened with wcslib."
LICENSE = "LGPL-3.0-or-later"

PV = "7.12"

RPM_NAME = "wcslib-tools-7.12-1.7.aarch64.rpm"
RPM_HASH = "7d4c090eb3a6f52f736d8ae05c97b15ae6e94fbf9152b8fb0acf4c19ac2c17be2012f59193fcf8935d6136f23875052070748a1014563583cba0872733eae7da"

RPROVIDES:${PN} += "libwcs-tools \
wcslib-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libm.so.6 \
libwcs7"

inherit rpm

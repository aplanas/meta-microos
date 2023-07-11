SUMMARY = "Header files and libraries for hiredis"
DESCRIPTION = "The hiredis-devel package contains the header files and \
libraries for Redis database."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "hiredis-devel-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "a20fd2a1872fe6e46bfe8cfddb7917c6820ad0f4936fc8334876be18114091be47b05f6fa0bc6c54cefb1b0a827cef9bb63d33fb5eb33ea36a03eabaf7adb0eb"

RPROVIDES:${PN} += "hiredis-devel \
pkgconfig-hiredis \
pkgconfig-hiredis-ssl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhiredis1-1-0 \
pkgconfig-hiredis"

inherit rpm

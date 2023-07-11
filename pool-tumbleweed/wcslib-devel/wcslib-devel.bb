SUMMARY = "Development files for wcslib"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use wcslib."
LICENSE = "LGPL-3.0-or-later"

PV = "7.12"

RPM_NAME = "wcslib-devel-7.12-1.7.aarch64.rpm"
RPM_HASH = "b8d743b2b11c88525b63c77d468f50e3ef25426b0846936d4963f8165f8d4676c55f9199f1bdae508841cbd1a936c554ad7b52d3695f8d3eaa688d89097f85b7"

RPROVIDES:${PN} += "libwcs-devel \
pkgconfig-wcslib \
wcslib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cfitsio-devel \
libwcs7"

inherit rpm

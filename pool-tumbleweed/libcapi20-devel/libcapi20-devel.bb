SUMMARY = "Header files for the Common ISDN API library"
DESCRIPTION = "This package provides files needed for development of CAPI-aware \
software."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.27"

RPM_NAME = "libcapi20-devel-3.27-2.9.aarch64.rpm"
RPM_HASH = "122ea31f74f3e7cee755549dbaec903154d7050ffcc03d98e70a2ea3b4489662776c1c0a969ea839446f3678e265d39fe01dfffd0e3a59fe7f04fd7b32afed4b"

RPROVIDES:${PN} += "capi4linux-devel \
libcapi20-devel \
pkgconfig-capi20"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcapi20-3"

inherit rpm

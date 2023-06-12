SUMMARY = "Open Object Rexx development files"
DESCRIPTION = "This package contains headers and files needed for developing extensions for \
Open Object Rexx."
LICENSE = "CPL-1.0"

PV = "4.2.0"

RPM_NAME = "ooRexx-devel-4.2.0-18.12.aarch64.rpm"
RPM_HASH = "fd48ce60e721518b5c5b4ef8ccddd9350071ba7e694b4c8b52ffeddfb7d4ad7131de6a69ab421c8208f4dd8b7f327f15b3fb8cec7792f6aee0d4febcf3b59458"

RPROVIDES:${PN} += "ooRexx-devel \
ooRexx-devel(aarch-64) \
pkgconfig(ooRexx)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
glibc-devel \
ooRexx"

inherit rpm

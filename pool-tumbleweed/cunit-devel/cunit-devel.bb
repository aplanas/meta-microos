SUMMARY = "CUnit development files"
DESCRIPTION = "CUnit is a unit testing framework for C. \
This package installs the CUnit development files."
LICENSE = "LGPL-2.0"

PV = "2.1.3"

RPM_NAME = "cunit-devel-2.1.3-5.27.aarch64.rpm"
RPM_HASH = "bb7763df5022a994a5fb0f1270dd9e8bda7ddeb801fa249dd48a7ac5de9237df4d00e24940e783fc6334efb1a832253b91a37298aa4c7e1a17768c0862f4dd4c"

RPROVIDES:${PN} += "cunit-devel \
pkgconfig-cunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcunit.so.1 \
libcunit1 \
ncurses-devel \
pkg-config"

inherit rpm

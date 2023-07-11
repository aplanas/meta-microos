SUMMARY = "Development files for libpwquality, a library for password quality checking"
DESCRIPTION = "libpwquality is a library for password quality checks and generation \
of random passwords that pass the checks. \
 \
This package provides files needed for development of applications \
using the libpwquality library."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "libpwquality-devel-1.4.5-1.3.aarch64.rpm"
RPM_HASH = "d27681ca07d10c4f0092617811698b7efeeca75c95a624544c91ec8681c5c3eda0b744968c56004db27a59c7a819996f4ee9a7ed64927002e70c9a5d2bb9b0f4"

RPROVIDES:${PN} += "libpwquality-devel \
pkgconfig-pwquality"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpwquality1 \
pkgconfig"

inherit rpm

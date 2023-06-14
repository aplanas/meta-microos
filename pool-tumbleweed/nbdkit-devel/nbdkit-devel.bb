SUMMARY = "Development files and documentation for nbdkit"
DESCRIPTION = "This package contains development files and documentation \
for nbdkit.  Install this package if you want to develop \
plugins for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-devel-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "84fb726d59ad47848870ecaba8eadbc0b4ec3061798c60644cb987857f6577c9ff615ae13564749527749b0fab1f0ce1b62ff6e0743ec78142fdd77101dac9bd"

RPROVIDES:${PN} += "nbdkit-devel \
pkgconfig-nbdkit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
nbdkit-server \
pkgconfig"

inherit rpm

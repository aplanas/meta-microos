SUMMARY = "BCUnit shared library"
DESCRIPTION = "BCUnit is a unit testing framework for C. \
This package installs the BCUnit shared library."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.2+git.20191119"

RPM_NAME = "libbcunit1-3.0.2+git.20191119-1.14.aarch64.rpm"
RPM_HASH = "13f13c27a9ef08cdc2cc82d88ffe623c84e4b5404701f86f5f49a6ae54c9aa895a6eb9e51a7330db6193636950b0269efd3510dcbcdc181eb8644ff4607b31fd"

RPROVIDES:${PN} += "libbcunit.so.1 \
libbcunit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

SUMMARY = "Python3 bindings for libsoc"
DESCRIPTION = "libsoc is a C library to interface with common peripherals found in System \
on Chips (SoC) through generic Linux Kernel interfaces. \
 \
This package contains python3 bindings for libsoc."
LICENSE = "LGPL-2.1-only"

PV = "0.8.2"

RPM_NAME = "python3-libsoc-0.8.2-3.14.aarch64.rpm"
RPM_HASH = "9806066f3697b1a93cbf502a6d8aa7b4281e8a4653b1b1d69827efc832438c4f95ab2bf12f7ac0a497bff4daee487e473fcc3fd668a79e0c5473ae7b2f97d2e4"

RPROVIDES:${PN} += "python3-libsoc"

RDEPENDS:${PN} += "libsoc2 \
python-abi"

inherit rpm

SUMMARY = "Header files for libchipcard, a library for accessing smartcards"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.6"

RPM_NAME = "libchipcard-devel-5.1.6-1.12.aarch64.rpm"
RPM_HASH = "6c4217e995247faec4268a181c1b1daee1ed7d2e88b4da51636f517c12a7e884a4683e89af96280bfec00541df8d3f0d1c11d5cc7dd5bd67a866ee2c0e4894b5"

RPROVIDES:${PN} += "libchipcard-devel \
pkgconfig-libchipcard-client \
pkgconfig-libchipcard-server"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gwenhywfar-devel \
libchipcard \
libchipcard6 \
libusb-devel \
pcsc-lite-devel \
sysfsutils"

inherit rpm

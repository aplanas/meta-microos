SUMMARY = "Development files for the USB gadget configuration library"
DESCRIPTION = "libusbgx is a C library encapsulating the kernel USB gadget-configfs \
userspace API functionality. \
 \
It provides routines for creating and parsing USB gadget devices \
using the configfs API. Currently, all USB gadget configfs functions \
that can be enabled in kernel release 3.11 are supported. \
 \
This subpackage contains the development headers for the libusbgx \
headers and libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "libusbgx-devel-0.2.0-1.14.aarch64.rpm"
RPM_HASH = "1f7a69e0e51bd1b077c16523355d45361144c8f75301053a9bea9947bdaeeb5ec2f9061562d81f98ee43381a3f5a5c7716fec9cec79463e2e470f493785e00cd"

RPROVIDES:${PN} += "libusbgx-devel \
pkgconfig-libusbgx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusbgx2 \
pkgconfig-libconfig"

inherit rpm

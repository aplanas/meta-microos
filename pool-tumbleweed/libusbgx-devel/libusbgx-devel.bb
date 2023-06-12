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

RPM_NAME = "libusbgx-devel-0.2.0-1.13.aarch64.rpm"
RPM_HASH = "421844863bc404b68dd6bc2f63c4eb5247f8a9ec726b5c8e31e1ca92da34d1a59838529c6b3194271bd1afe39a7ea500a23ea90da93282a81126adb7dc5bda98"

RPROVIDES:${PN} += "libusbgx-devel \
libusbgx-devel(aarch-64) \
pkgconfig(libusbgx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusbgx2 \
pkgconfig(libconfig)"

inherit rpm

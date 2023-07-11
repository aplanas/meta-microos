SUMMARY = "VOLK shared library"
DESCRIPTION = "This package provides the VOLK shared library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "libvolk3_0-3.0.0-1.4.aarch64.rpm"
RPM_HASH = "4f4f03d96076f64ec8bed44a00af6e352bdbb255c7c846c6539e036edd024167f80ee30133128b8ea0022636829f7af41485b5d74a9eb66c2f6e4f540b59fefd"

RPROVIDES:${PN} += "libvolk.so.3.0 \
libvolk3-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
liborc-0.4.so.0"

inherit rpm

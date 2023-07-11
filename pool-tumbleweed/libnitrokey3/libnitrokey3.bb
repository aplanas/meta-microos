SUMMARY = "Shared library for libnitrokey"
DESCRIPTION = "Libnitrokey is a project to communicate with Nitrokey Pro and Storage devices \
in a clean and easy manner. \
 \
This package holds the shared library."
LICENSE = "LGPL-3.0-only"

PV = "3.8"

RPM_NAME = "libnitrokey3-3.8-1.4.aarch64.rpm"
RPM_HASH = "8e9bd49f802cbaafba2c0f10a60e581e2e28651708ff402dd1a2860622fefc2c8545483dcf3c9f69202a782289a566caa2aa86ab87d5a33b77226910311e323c"

RPROVIDES:${PN} += "libnitrokey.so.3 \
libnitrokey3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhidapi-libusb.so.0 \
libnitrokey-udev \
libstdc++.so.6"

inherit rpm

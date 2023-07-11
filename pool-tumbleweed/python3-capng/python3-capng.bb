SUMMARY = "Python bindings for libcap-ng library"
DESCRIPTION = "The libcap-ng-python package contains the bindings so that libcap-ng \
and can be used by Python applications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "python3-capng-0.8.3-2.2.aarch64.rpm"
RPM_HASH = "95d6327e65117964cd0bda324c7993727d2987be2f4b531bc3fd927787c2106cdc73a8de5774a2af7930881c20ec7fcb6bb0e16c2d6459bd44f4a1b99977675b"

RPROVIDES:${PN} += "python3-capng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libcap-ng0 \
python-abi"

inherit rpm

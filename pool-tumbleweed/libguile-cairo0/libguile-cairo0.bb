SUMMARY = "Guile cairo libary"
DESCRIPTION = "Libraries for Guile bindings for Cairo."
LICENSE = "LGPL-3.0-or-later"

PV = "1.11.2"

RPM_NAME = "libguile-cairo0-1.11.2-1.3.aarch64.rpm"
RPM_HASH = "0ed2376c82fee69089f2922837cb24432582e154b443d09dc3a0b302e17f67005379c85e4ffaecd71d9f8b7ab88f8882ba294333e61aa1d463c01edcd55ce3b7"

RPROVIDES:${PN} += "libguile-cairo.so.0 \
libguile-cairo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libguile-3.0.so.1"

inherit rpm

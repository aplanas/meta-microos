SUMMARY = "TCTI interface loading library"
DESCRIPTION = "This is a helper library that simplifies loading other tcti libraries. It is \
recommended over custom tcti loading code in applications."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tctildr0-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "3bbc9f19e77755a9ad124b1e239bb686ab31006f65a5f9ed7ba0d58c938b61f1cf55024652fb243222f01c48351e278a6ab8bef0f1f30f6fe63a3c5a8a3bae3d"

RPROVIDES:${PN} += "libtss2-tctildr.so.0 \
libtss2-tctildr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

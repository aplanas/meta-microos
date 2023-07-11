SUMMARY = "The kim-api library"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package contains the kim-api library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "libkim-api2-2.3.0-1.9.aarch64.rpm"
RPM_HASH = "c2a0eaea20eb15f8831dc01dc92f23086cafb987dabed3a3ac6784c64f2952ff9e3c53e43abdf4348f54d268cdee55df84c41e6c615db074a61d14ed72849425"

RPROVIDES:${PN} += "libkim-api.so.2 \
libkim-api2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

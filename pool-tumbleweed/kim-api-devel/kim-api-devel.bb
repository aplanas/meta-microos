SUMMARY = "Development headers and libraries for kim-api"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package contains the development files (headers and documentation) for the \
KIM-API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "kim-api-devel-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "7819b7c9f3b539c848e254ac1059250a96c87a90bb60d17a0118e6ac80aa3b6ba48b3e7dde8e17960b955fa592fb10eff18c70db5c92ca6162b4859f2e501fd6"

RPROVIDES:${PN} += "cmake(kim-api) \
cmake(kim-api-items) \
kim-api-devel \
kim-api-devel(aarch-64) \
pkgconfig(libkim-api)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
kim-api \
libkim-api2 \
vim"

inherit rpm

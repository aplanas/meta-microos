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

RPM_NAME = "kim-api-devel-2.3.0-1.9.aarch64.rpm"
RPM_HASH = "20057cd3d94eaf7ab8cd465145f2b37938e023d588f1c721853716a4c4db1050c33b06f1068399be3405f86dd01a332283be94b634fc8ede608aa3a3100ccaae"

RPROVIDES:${PN} += "cmake-kim-api \
cmake-kim-api-items \
kim-api-devel \
pkgconfig-libkim-api"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
kim-api \
libkim-api2 \
vim"

inherit rpm

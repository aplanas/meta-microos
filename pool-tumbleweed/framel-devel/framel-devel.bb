SUMMARY = "Headers and sources for developing with the gravitational wave frame library"
DESCRIPTION = "The Frame Library is a software in C language, with interfaces to python and \
matlab, dedicated to frame data manipulation including file input/output. \
 \
This package property the headers and sources needed to develop applications \
against the frame library."
LICENSE = "LGPL-2.1-or-later"

PV = "8.42.3"

RPM_NAME = "framel-devel-8.42.3-1.5.aarch64.rpm"
RPM_HASH = "7c7442c7df407466f46cd74f5986e56d4a0944ec7dc61c190847029f8b0e653572f385d8538a53b3fecd0e117d597ac1aa0517ff7de6fa1cfd8d7539976d1a1d"

RPROVIDES:${PN} += "framel-devel \
framel-devel(aarch-64) \
pkgconfig(framel)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libframel8"

inherit rpm

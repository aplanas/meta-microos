SUMMARY = "Headers and sources for developing with the gravitational wave frame library"
DESCRIPTION = "The Frame Library is a software in C language, with interfaces to python and \
matlab, dedicated to frame data manipulation including file input/output. \
 \
This package property the headers and sources needed to develop applications \
against the frame library."
LICENSE = "LGPL-2.1-or-later"

PV = "8.42.3"

RPM_NAME = "framel-devel-8.42.3-1.6.aarch64.rpm"
RPM_HASH = "d0e5824a10f92f26c6e3f8847d76c8584dc2fed03c9840f6ee8fc7aa7a30cc8c8f13113963cde80cdcef0966a4863b6463fc275ca004b3d5d8128c1ae54031b7"

RPROVIDES:${PN} += "framel-devel \
pkgconfig-framel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libframel8"

inherit rpm

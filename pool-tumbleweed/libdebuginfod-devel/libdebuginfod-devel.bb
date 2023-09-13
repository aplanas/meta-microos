SUMMARY = "Libraries and headers to build debuginfod client applications"
DESCRIPTION = "The libdebuginfod-devel package contains the libraries \
to create applications to use the debuginfod service."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod-devel-0.189-5.1.aarch64.rpm"
RPM_HASH = "70ad859a5d6d63a19188e712b771bb9de2d9a3c7b86af85ff20ba12d1954cbd20c48309b3abcebfc3a224c8529435fa0845c996e1c57e59b8089cd4930cd23e5"

RPROVIDES:${PN} += "libdebuginfod-devel \
pkgconfig-libdebuginfod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdebuginfod1"

inherit rpm

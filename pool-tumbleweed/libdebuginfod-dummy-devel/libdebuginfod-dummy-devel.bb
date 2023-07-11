SUMMARY = "Libraries and headers to build debuginfod client applications"
DESCRIPTION = "The libdebuginfod-devel package contains the libraries \
to create applications to use the debuginfod service. \
The package is dummy."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod-dummy-devel-0.189-3.3.aarch64.rpm"
RPM_HASH = "cd9809f6e7932d9e3d63db03d71ed5c62edc1aa6300dea8fc91d018b10fa1f476aef40830d5cbd80d25996b698724ef8ec5d7bb6f879aa73963a040343998385"

RPROVIDES:${PN} += "libdebuginfod-devel \
libdebuginfod-dummy-devel"

RDEPENDS:${PN} += "libdebuginfod1-dummy"

inherit rpm

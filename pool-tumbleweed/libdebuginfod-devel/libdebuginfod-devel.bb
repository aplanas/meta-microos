SUMMARY = "Libraries and headers to build debuginfod client applications"
DESCRIPTION = "The libdebuginfod-devel package contains the libraries \
to create applications to use the debuginfod service."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod-devel-0.189-3.2.aarch64.rpm"
RPM_HASH = "802e86354de4df7f139fb3db94abfe191df5d546d9bf7373436fe0671db363127d9b52871a5a20832da11b26848fd47dce5c9f59a07bcfcd5c61f3fc722ecd2f"

RPROVIDES:${PN} += "libdebuginfod-devel \
pkgconfig-libdebuginfod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdebuginfod1"

inherit rpm

SUMMARY = "Libraries and header files for liborigin"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that read OriginLab OPJ project files."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "liborigin-devel-3.0.1-1.11.aarch64.rpm"
RPM_HASH = "83bea9a33f017f246dcf279ac9cdaec26430da74bdf86f973d7e9c6b212014a37f4a6fb518b21b181d988ed7486cb578c2ae015a526532fdec8cf6b5a39593bd"

RPROVIDES:${PN} += "liborigin-devel \
pkgconfig-liborigin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liborigin3"

inherit rpm

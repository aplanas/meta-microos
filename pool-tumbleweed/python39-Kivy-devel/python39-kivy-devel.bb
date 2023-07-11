SUMMARY = "Development files for python39-Kivy"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps. \
 \
This package contains the headers and source files for extending kivy"
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-Kivy-devel-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "7725d9c4961aae102bc49a4237d833214b81d00010b81cd7a7c4cdfdb98b26ed4057a52fa2783b93c16a4ea0a247f42d032f960acad28599440fd503f8c82b6d"

RPROVIDES:${PN} += "python39-Kivy-devel"

RDEPENDS:${PN} += "python39-Kivy"

inherit rpm

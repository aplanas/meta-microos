SUMMARY = "Development files for python310-Kivy"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps. \
 \
This package contains the headers and source files for extending kivy"
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-Kivy-devel-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "3b7e3fd7546a502c265671cc6de84a8dc52d940b0650b6470ba6ae853e49f659c4c2785a5573091621bdc60b7c87d168540ad47a6f79aaa65949c00061867056"

RPROVIDES:${PN} += "python310-Kivy-devel"

RDEPENDS:${PN} += "python310-Kivy"

inherit rpm

SUMMARY = "Development files for python310-Kivy"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps. \
 \
This package contains the headers and source files for extending kivy"
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python310-Kivy-devel-2.2.1-1.1.aarch64.rpm"
RPM_HASH = "10db04250dbc3f9bfff7d45273d49f0e0c5d91d92be0173cf7c2f7cdcfebb3abf794c10ec81683afcfb7e6bf106643e33591b6cca85ad0beb02c14b7e441b001"

RPROVIDES:${PN} += "python310-Kivy-devel"

RDEPENDS:${PN} += "python310-Kivy"

inherit rpm

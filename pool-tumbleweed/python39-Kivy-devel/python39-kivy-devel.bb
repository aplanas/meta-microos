SUMMARY = "Development files for python39-Kivy"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps. \
 \
This package contains the headers and source files for extending kivy"
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-Kivy-devel-2.1.0-3.6.aarch64.rpm"
RPM_HASH = "792469dbb9114b33c03fa3c1f8d29114a4071eaba4c811021c4e6059c70f2f1a85d7a3e2f8cd6846d6c269fb556ffe2962ec7dee26bfdd2bbcbf7ee07e572d4f"

RPROVIDES:${PN} += "python39-Kivy-devel"

RDEPENDS:${PN} += "python39-Kivy"

inherit rpm

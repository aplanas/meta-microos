SUMMARY = "Documentation for Kivy, a multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python-Kivy-doc-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "1401966e2240c88aa617e8ea72f42fbc9fad9fc404a9a029f85abcc4ea01a66c971c73070cceb9ef08aaedd7ebf40f83c8918cea52448fb162d41e5b6ca196eb"

RPROVIDES:${PN} += "python-Kivy-doc \
python310-Kivy-doc \
python311-Kivy-doc \
python39-Kivy-doc"

RDEPENDS:${PN} += ""

inherit rpm

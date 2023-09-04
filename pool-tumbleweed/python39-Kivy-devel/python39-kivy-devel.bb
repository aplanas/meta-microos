SUMMARY = "Development files for python39-Kivy"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps. \
 \
This package contains the headers and source files for extending kivy"
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python39-Kivy-devel-2.2.1-1.1.aarch64.rpm"
RPM_HASH = "094baee90e39ecdb27fb5c7a79c19d6a9e87604305447a9e4f754d50a19af415cba4f3264ee118787f00ff1c31c5c371e546cfbe7411f3ce3690c3a9315f6493"

RPROVIDES:${PN} += "python39-Kivy-devel"

RDEPENDS:${PN} += "python39-Kivy"

inherit rpm

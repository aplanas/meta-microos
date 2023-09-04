SUMMARY = "Development files for python311-Kivy"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps. \
 \
This package contains the headers and source files for extending kivy"
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python311-Kivy-devel-2.2.1-1.1.aarch64.rpm"
RPM_HASH = "2dac2f390e7cf5b34a06bbfb4ef5acb82016265f32f9e6b2f593204af54e12488bebe9099030562de6cc80dc1a8efc4bb089f4c7c451e2be3e8ef9bcea5d179e"

RPROVIDES:${PN} += "python3-Kivy-devel \
python311-Kivy-devel"

RDEPENDS:${PN} += "python311-Kivy"

inherit rpm

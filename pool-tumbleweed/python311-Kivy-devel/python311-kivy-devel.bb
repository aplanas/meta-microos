SUMMARY = "Development files for python311-Kivy"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps. \
 \
This package contains the headers and source files for extending kivy"
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-Kivy-devel-2.2.0-1.2.aarch64.rpm"
RPM_HASH = "c92d870884a7245da79c1c8538e46d039802922b0f3b398b567055cffc27cc302e97bb574a29f9773d75bc2db4b05b4d67878109e094bd871591bc587f346cb9"

RPROVIDES:${PN} += "python3-Kivy-devel \
python311-Kivy-devel"

RDEPENDS:${PN} += "python311-Kivy"

inherit rpm

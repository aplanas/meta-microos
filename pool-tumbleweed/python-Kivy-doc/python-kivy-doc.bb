SUMMARY = "Documentation for Kivy, a multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python-Kivy-doc-2.2.1-1.1.aarch64.rpm"
RPM_HASH = "b75a977ee84f5b01c166e3c3962992b719d0dbc92830026f43275068d9797bd49c7c7c4d83cb88f9e622a8928af86c06666b9cc26804e699fb8bd522bc0c1ca2"

RPROVIDES:${PN} += "python-Kivy-doc \
python310-Kivy-doc \
python311-Kivy-doc \
python39-Kivy-doc"

RDEPENDS:${PN} += ""

inherit rpm

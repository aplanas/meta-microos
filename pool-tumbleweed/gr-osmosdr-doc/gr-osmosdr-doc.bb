SUMMARY = "Documentation for gnuradio-osmosdr"
DESCRIPTION = "Documentation for gr-osmosdr module for GNU Radio."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "gr-osmosdr-doc-0.2.4-1.3.noarch.rpm"
RPM_HASH = "56ff7eb72a26c37516bab862b9d8cc33d9832a0e8eca0fa287de24e9be3db14413b7f70fe3d05337f3a47a078b620232b4f603601eb24c6fffe83e3cf8cd045e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gr-osmosdr-doc"

RDEPENDS:${PN} += "gr-osmosdr"

inherit rpm

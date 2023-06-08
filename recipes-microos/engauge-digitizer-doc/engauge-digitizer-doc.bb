SUMMARY = "Documentation for Engauge Digitizer"
DESCRIPTION = "This package contains the documentation for Engauge Digitizer."
LICENSE = "GPL-2.0-or-later"

PV = "12.1"

RPM_NAME = "engauge-digitizer-doc-12.1-2.4.noarch.rpm"
RPM_HASH = "58c34fc41e7e06b2bb9f17d648554d65356ac231c3b2d4f7f177c05f76557b3547d46cfc2761bf6390c130521f44a58b8d0a48b564f15dd165b3f8bafe12adb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "engauge-digitizer-doc"
RDEPENDS:${PN} += "engauge-digitizer"

inherit rpm

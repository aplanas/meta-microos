SUMMARY = "Static library for development with readline"
DESCRIPTION = "This package contains the static library for the readline library."
LICENSE = "GPL-3.0-or-later"

PV = "8.2"

RPM_NAME = "readline-devel-static-8.2-2.4.aarch64.rpm"
RPM_HASH = "641b658adc21f11f0a09ba1f027a6823fdefbfbef685b9ce5840d2c4178c910eb0e2a4ee1a46c99cd24d0e24ac4df16015c84cc4dd4ae58b20383239e6629c5d"

RPROVIDES:${PN} += "readline-devel-static"

RDEPENDS:${PN} += "ncurses-devel \
readline-devel"

inherit rpm

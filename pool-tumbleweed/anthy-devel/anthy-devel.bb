SUMMARY = "Header files for the Anthy Kana–Kanji conversion engine"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libanthy."
LICENSE = "GPL-2.0-or-later"

PV = "9100h"

RPM_NAME = "anthy-devel-9100h-41.10.aarch64.rpm"
RPM_HASH = "90fd6a6f91611ff8e640adcb35b2ee262aadfc050deb512891664efcfe4a3cd1c9dc7d4b50281ccd1c5f69511399e55d66e7b3bd40b85183cacb6f4fa1c17fe6"

RPROVIDES:${PN} += "anthy-devel \
pkgconfig-anthy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libanthy0"

inherit rpm

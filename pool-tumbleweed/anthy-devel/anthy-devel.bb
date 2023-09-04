SUMMARY = "Header files for the Anthy Kana–Kanji conversion engine"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libanthy."
LICENSE = "GPL-2.0-or-later"

PV = "9100h"

RPM_NAME = "anthy-devel-9100h-42.1.aarch64.rpm"
RPM_HASH = "c7e0776d92e9fdf92c967e9f34bfcc9dc671f65eadb0a0827addc496d9578ce5a34fcd94b4971a83c7685cdbeda7694cd3fe130945c468a479b52b899bba5f95"

RPROVIDES:${PN} += "anthy-devel \
pkgconfig-anthy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libanthy0"

inherit rpm

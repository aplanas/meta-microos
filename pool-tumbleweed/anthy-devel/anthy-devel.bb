SUMMARY = "Header files for the Anthy Kana–Kanji conversion engine"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libanthy."
LICENSE = "GPL-2.0-or-later"

PV = "9100h"

RPM_NAME = "anthy-devel-9100h-41.9.aarch64.rpm"
RPM_HASH = "de0091012ff3f5a2e02ab75d8c0f2fdd75f4edced982749be1702fb53618b885c6dd618a3b6792318e73a0cb950c491cedaab70b9cd8ba2659936956f54c0869"

RPROVIDES:${PN} += "anthy-devel \
pkgconfig-anthy"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libanthy0"

inherit rpm

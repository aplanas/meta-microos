SUMMARY = "Plymouth 'Spinfinity' theme"
DESCRIPTION = "This package contains the 'Spinfinity' boot splash theme for \
Plymouth. It features a centered logo and animated spinner that \
spins in the shape of an infinity sign."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-spinfinity-22.02.122+94.4bd41a3-9.1.noarch.rpm"
RPM_HASH = "e76850a4babe7d5d28a3e069a7085ebdca5d45025fe4a450719bbf3470736c750d865e7ed674d329755967ac39b50d9dc98ec16b2cd59ea8ab5464ffef6ba123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-spinfinity"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth \
plymouth-scripts"

inherit rpm

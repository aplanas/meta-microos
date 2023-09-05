SUMMARY = "Plymouth 'Fade-In' theme"
DESCRIPTION = "This package contains the 'Fade-In' boot splash theme for \
Plymouth. It features a centered logo that fades in and out \
while stars twinkle around the logo during system boot up."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-fade-in-22.02.122+94.4bd41a3-10.1.noarch.rpm"
RPM_HASH = "b73acaed2133c486ca7b2798c659ad11f3b4a69ba9e971333bc643f7d816796af0e865896cddd9f9679771f3c0ee8bb2a98c9e12603ab8ed33a880921f38d7a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-fade-in"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth-plugin-fade-throbber \
plymouth-plugin-label \
plymouth-scripts"

inherit rpm

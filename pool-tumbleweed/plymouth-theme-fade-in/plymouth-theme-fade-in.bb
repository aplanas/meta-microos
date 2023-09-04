SUMMARY = "Plymouth 'Fade-In' theme"
DESCRIPTION = "This package contains the 'Fade-In' boot splash theme for \
Plymouth. It features a centered logo that fades in and out \
while stars twinkle around the logo during system boot up."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-fade-in-22.02.122+94.4bd41a3-9.1.noarch.rpm"
RPM_HASH = "b68d42ef0a3040f44f60e58c3dd9eb034bab47e1ab0cea933b1157e3e4dd279bfb58e8ca799498b1bb3a9e9577360b7c3ad856a403d58f4c041121088dd316e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-fade-in"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth-plugin-fade-throbber \
plymouth-plugin-label \
plymouth-scripts"

inherit rpm

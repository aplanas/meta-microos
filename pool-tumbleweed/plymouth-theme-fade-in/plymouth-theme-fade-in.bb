SUMMARY = "Plymouth 'Fade-In' theme"
DESCRIPTION = "This package contains the 'Fade-In' boot splash theme for \
Plymouth. It features a centered logo that fades in and out \
while stars twinkle around the logo during system boot up."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-fade-in-22.02.122+94.4bd41a3-5.1.noarch.rpm"
RPM_HASH = "2fe09fd8778c7de7155ddbf02919fdc55cabecf2c8264118fdf8766d2576dbb3459bfd67e681796b130dd1d80216396601fda829e80c106f047b72e057b215bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-fade-in"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth-plugin-fade-throbber \
plymouth-plugin-label \
plymouth-scripts"

inherit rpm

SUMMARY = "Install hunspell"
DESCRIPTION = "This module provides the spelling library Hunspell. It will either detect \
it as provided by the operating system, or download the source from the \
Internet and install it for you. It uses Alien::Base."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Alien-Hunspell-0.17-1.4.aarch64.rpm"
RPM_HASH = "172394a37e9369de4ed057b0489423d95af23b8d451cf25f0f7721529b7abd2263923d05be3d7c9c99de2bf3ef90198d84e03d6c4dfb99e55878156f72a83fa9"

RPROVIDES:${PN} += "perl-Alien--Hunspell \
perl-Alien--Hunspell--Install--Files \
perl-Alien-Hunspell"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Alien--Base \
pkgconfig-hunspell"

inherit rpm

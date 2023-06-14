SUMMARY = "Install hunspell"
DESCRIPTION = "This module provides the spelling library Hunspell. It will either detect \
it as provided by the operating system, or download the source from the \
Internet and install it for you. It uses Alien::Base."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Alien-Hunspell-0.17-1.3.aarch64.rpm"
RPM_HASH = "fef0252f02548714bab1a130611cca693ab4b8e1779b0c27aa2f919a6d8db12298e4069f3a697ceaaba089a0206f8b806e6e86e8a00e6f9cd58921b1d5928030"

RPROVIDES:${PN} += "perl-Alien--Hunspell \
perl-Alien--Hunspell--Install--Files \
perl-Alien-Hunspell"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Alien--Base \
pkgconfig-hunspell"

inherit rpm

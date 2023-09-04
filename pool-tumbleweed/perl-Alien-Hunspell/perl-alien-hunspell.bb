SUMMARY = "Install hunspell"
DESCRIPTION = "This module provides the spelling library Hunspell. It will either detect \
it as provided by the operating system, or download the source from the \
Internet and install it for you. It uses Alien::Base."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Alien-Hunspell-0.17-1.5.aarch64.rpm"
RPM_HASH = "50cbba5cb96718974d33cc46a9ffd970d74733fa1087eceb285e886ff53577e6f43897a853e2135b6a6e9e2b776dc28fef15f83fb05c0db6b6e544f26f8dca2b"

RPROVIDES:${PN} += "perl-Alien--Hunspell \
perl-Alien--Hunspell--Install--Files \
perl-Alien-Hunspell"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Alien--Base \
pkgconfig-hunspell"

inherit rpm

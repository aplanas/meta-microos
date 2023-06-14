SUMMARY = "Development files for libXISF"
DESCRIPTION = "This package contains all the needed development files to use libXISF."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.6"

RPM_NAME = "libXISF-devel-0.2.6-1.1.aarch64.rpm"
RPM_HASH = "2c92678d465bdd46033259fe634bdf120dfa617975b8eae1fcb2bb92b2b9d1c10053aefad5a64d6c2a9840234406394ae2f043ee17af9c76c119a345ef299d19"

RPROVIDES:${PN} += "libXISF-devel \
pkgconfig-libxisf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXISF0"

inherit rpm

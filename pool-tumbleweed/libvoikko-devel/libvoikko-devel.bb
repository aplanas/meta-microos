SUMMARY = "Library of free natural language processing tools"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
This package contains the files needed to build or develop applications \
that use Voikko."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.2"

RPM_NAME = "libvoikko-devel-4.3.2-2.1.aarch64.rpm"
RPM_HASH = "8ed42b9a628885c4b24eefa29b7cc48a0bcb6f80038f9dc8e11d15d706681dfbad50dd0870b9c3d493158631e9e38f64ea2b3c2f6d823d32d839a0ce2885b1ce"

RPROVIDES:${PN} += "libvoikko-devel \
pkgconfig-libvoikko"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libvoikko1"

inherit rpm

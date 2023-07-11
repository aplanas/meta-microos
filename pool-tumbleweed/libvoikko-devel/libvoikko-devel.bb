SUMMARY = "Library of free natural language processing tools"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
This package contains the files needed to build or develop applications \
that use Voikko."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.2"

RPM_NAME = "libvoikko-devel-4.3.2-1.1.aarch64.rpm"
RPM_HASH = "574208128c619a3f5e17c82119142110bb60ba9c5dbd6411224dfe5a9e1f8680eb6aa3dce1d89bef9a15e39c5b18047da4f24b34584a51e1f18d149cf2923b6e"

RPROVIDES:${PN} += "libvoikko-devel \
pkgconfig-libvoikko"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libvoikko1"

inherit rpm

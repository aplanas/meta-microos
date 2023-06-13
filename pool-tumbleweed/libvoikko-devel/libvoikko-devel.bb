SUMMARY = "Library of free natural language processing tools"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
This package contains the files needed to build or develop applications \
that use Voikko."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "libvoikko-devel-4.3.1-1.10.aarch64.rpm"
RPM_HASH = "68dbf68afcf5498160fbaf6ebe3870edf21dbc6517ce4c2ba1ec43aa3ce44b1d9089e6c971746d4fa30c86f04ab3b35fafb4851500779288dce1ee38e9b97fb3"

RPROVIDES:${PN} += "libvoikko-devel \
libvoikko-devel(aarch-64) \
pkgconfig(libvoikko)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libvoikko1"

inherit rpm

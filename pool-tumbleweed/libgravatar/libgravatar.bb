SUMMARY = "Library to download and display gravatars"
DESCRIPTION = "This package contains the debug categories for the libgravatar library."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libgravatar-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ce00d9a9125711ebd59b04eb02c015810c7ff02e8bdb65cf918b193419de7f024f65de0ad55f42a00f51e6b2dae4d7beadc6640b6c2698c5661ed25396edc503"

RPROVIDES:${PN} += "libgravatar \
libgravatar(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Development package for Palapeli"
DESCRIPTION = "This package contains the development files for Palapeli."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "palapeli-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "8e7b8b06db246d0c156cb30a5f1d97564ccbf7816a39612872517442ce932e8711ee1b6152287f1ebdef6ac67babc94e104b739662ab92946d663352ebbefb27"

RPROVIDES:${PN} += "cmake-Pala \
palapeli-devel"

RDEPENDS:${PN} += "palapeli"

inherit rpm

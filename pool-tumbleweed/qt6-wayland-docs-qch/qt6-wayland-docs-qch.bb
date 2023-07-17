SUMMARY = "Documentation for qt6-wayland in QCH format"
DESCRIPTION = "This package contains documentation for qt6-wayland in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "a9ce64ba69431a97bb968cf983796112cc0e8757ac4a4348ec6f9639a4fab3f5ef5daddcf9f49fa5831fd0d480ecaeecc4bc3bdd9701d193d1bc67a30f22aefb"

RPROVIDES:${PN} += "qt6-wayland-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

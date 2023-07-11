SUMMARY = "Data files for libimagevisualresult"
DESCRIPTION = "The package provides date for Deepin Image editor."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "libimagevisualresult-data-1.0.24-1.2.aarch64.rpm"
RPM_HASH = "bae3af9c28588ada61e6b02e08d6ec4be2bdab0b2ee31a351cb47a5ed2e95e43ff6582025c9552bf49987edc4cb0f20bc69dbacae4f6c23ff5010a483565e5b6"

RPROVIDES:${PN} += "libimagevisualresult-data"

RDEPENDS:${PN} += ""

inherit rpm

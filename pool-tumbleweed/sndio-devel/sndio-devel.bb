SUMMARY = "Library Developer Files for sndio"
DESCRIPTION = "This package contains files needed for development with the sndio \
library."
LICENSE = "ISC"

PV = "1.7.0"

RPM_NAME = "sndio-devel-1.7.0-1.11.aarch64.rpm"
RPM_HASH = "c7e3cd1ca94bc4eee4c089350074b5cd28452089121f9df6a137e2eef6ea3b9c542bd817fa2f1914e43779b5b7030cee2cd56c3b6147550f6a50a9f6e0683d16"

RPROVIDES:${PN} += "sndio-devel"

RDEPENDS:${PN} += "libsndio7-1"

inherit rpm

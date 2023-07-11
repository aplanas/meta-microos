SUMMARY = "Palapeli's standard puzzle files"
DESCRIPTION = "This package contains the standard puzzle files for Palapeli."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "palapeli-data-23.04.3-1.1.noarch.rpm"
RPM_HASH = "0bf7fb266f9d7caaa608f98cf6ae4ebd3ae05da199ce0a71615f0be9e42924869501e624f4f05cadf5e965e6ff4c5507edded8a90e36af87a3084376795bf2a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-palapeli-data \
palapeli-data"

RDEPENDS:${PN} += "palapeli"

inherit rpm

SUMMARY = "Chewing Data for libchewing"
DESCRIPTION = "This package contains data files for chewing, an intelligent phonetic \
input method library for traditional Chinese."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1+git20200627.452f622"

RPM_NAME = "chewing-data-0.5.1+git20200627.452f622-1.9.aarch64.rpm"
RPM_HASH = "a6106e01185061853a5d820b9d3256a3ff577a7e557354efc890e5c43a5bd23609e17a80a9b4ddf19f757346532d8532901a84524f812f33b816767b352a7401"

RPROVIDES:${PN} += "chewing-data chewing-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "Binary resource files for occt"
DESCRIPTION = "This package contains resource files imported from the libraries."
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "occt-resources-7.7.0-1.4.noarch.rpm"
RPM_HASH = "4dbc6be0eda3a0e6f59f17c42e9fb27b45059540f2f0242cd9802310a197bbcfbd54ec6413e9ed19e8fcb4b77959a60172e4bb2e18398c6cb17e014509798c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "occt-resources"

RDEPENDS:${PN} += ""

inherit rpm

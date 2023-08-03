SUMMARY = "YaST2 - Punjabi Translations"
DESCRIPTION = "Translations for Punjabi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-pa-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "1ae6778a589e60f0112d15bc8ece542c7748abc9774e1623bf3bb3574876eab9fcd9986f1e8c88ff7cf5bccebb2085eb2d145a5f81121a9ae6a669ed03c8983e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pa \
yast2-trans-pa"

RDEPENDS:${PN} += ""

inherit rpm

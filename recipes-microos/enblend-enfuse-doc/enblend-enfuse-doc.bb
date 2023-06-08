SUMMARY = "Usage Documentation for enblend and enfuse"
DESCRIPTION = "PDF usage documentation for the enblend and enfuse command line tools."
LICENSE = "GPL-2.0-or-later"

PV = "4.2"

RPM_NAME = "enblend-enfuse-doc-4.2-6.14.aarch64.rpm"
RPM_HASH = "29777311f5c98fa8b4e58e412ff409519840394bff87d46332d64c331eed77bbe53df3cf83b489608d694f0b962a71ed5987923e8f83cd40395eaa8ecc0dfcda"

RPROVIDES:${PN} += "enblend-enfuse-doc enblend-enfuse-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm

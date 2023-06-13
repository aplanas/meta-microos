SUMMARY = "Allegro Documentation"
DESCRIPTION = "Allegro HTML documentation and man pages."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro-doc-5.2.8.0-1.3.noarch.rpm"
RPM_HASH = "2b7983d19ffe04d9c5becd238b5674d5b2665e7d21b8ddcc5be20b3d5e9d1b49fb4af4db26e3f2fd521a669749f94c597ba8b845a4d2ae31b08e3322bbf27b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liballegro-doc"

RDEPENDS:${PN} += ""

inherit rpm

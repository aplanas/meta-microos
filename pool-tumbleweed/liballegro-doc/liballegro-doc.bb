SUMMARY = "Allegro Documentation"
DESCRIPTION = "Allegro HTML documentation and man pages."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro-doc-5.2.8.0-1.4.noarch.rpm"
RPM_HASH = "c283dbafbeac7cf50359dfc5957255ee65cbdcbf6c8124edafcd6e157f776787b58a7e2f1b7c95766b79bf990074a1856d6aeb6fa6c0b0ad19393ee86a622399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liballegro-doc"

RDEPENDS:${PN} += ""

inherit rpm

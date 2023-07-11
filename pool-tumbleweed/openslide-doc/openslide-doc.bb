SUMMARY = "Documentation for openslide"
DESCRIPTION = "This package contains documentation for developing with openslide library."
LICENSE = "LGPL-2.1-only"

PV = "3.4.1"

RPM_NAME = "openslide-doc-3.4.1-2.26.noarch.rpm"
RPM_HASH = "a9a71647c2323889e5703316498ccb4d7bd5f3ed97c2031caf697c5f3686d46b963365abf0023f2ce222246c65e0ef7e98061b64721e84c22bf2c5b33818a81a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openslide-doc"

RDEPENDS:${PN} += ""

inherit rpm

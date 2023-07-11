SUMMARY = "Documentation for the InChI library"
DESCRIPTION = "This package contains the user documentation for the InChI software \
and InChI library API reference for developers."
LICENSE = "LGPL-2.0-or-later"

PV = "1.06"

RPM_NAME = "inchi-doc-1.06-2.4.noarch.rpm"
RPM_HASH = "d96611b24bfd1e3585f85c7a617dc104af804be6c7606dd4662f7ca7810efc6c2d6b5d7d137b49792e0434bc9500cedb72b8c984d1fcce73d5a0327ef1d0b5e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "inchi-doc"

RDEPENDS:${PN} += ""

inherit rpm

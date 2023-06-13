SUMMARY = "Documentation files for PIC MCUs"
DESCRIPTION = "Documentation for gputils and supported PIC MCUs."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "gputils-doc-1.5.2-1.4.noarch.rpm"
RPM_HASH = "0fe6559111c5a4ed06f91a55ba265af28e08de7238faa0a21d96133190668f57e2d7b66128664757aaa1a626848ab578792a24a99e15e9c631149a9e65e57db4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gputils-doc"

RDEPENDS:${PN} += "gputils"

inherit rpm

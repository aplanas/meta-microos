SUMMARY = "KDE PIM Libraries: IMAP library"
DESCRIPTION = "KIMAP provides libraries to interface and communicate with \
IMAP mail servers."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kimap-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "6bb58a0a9c76e34b7c5a526dba5e936c2c871ef01d9cbb21b07c52802f80b93e521100abb97be3f2d2f0e10b8e09806c0ff3331867dac0ba444de9e47d176194"

RPROVIDES:${PN} += "kimap"

RDEPENDS:${PN} += ""

inherit rpm

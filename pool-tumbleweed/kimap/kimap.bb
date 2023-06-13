SUMMARY = "KDE PIM Libraries: IMAP library"
DESCRIPTION = "KIMAP provides libraries to interface and communicate with \
IMAP mail servers."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kimap-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "873b0b4ad60d5f997ddcaa7864fbb8700d5d4322f300ce6d8c60554334db4a14fcb81a35e7f8271fe54458478b4b90edc0d8c7259970b93f845fcdecdf56abd6"

RPROVIDES:${PN} += "kimap \
kimap(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm

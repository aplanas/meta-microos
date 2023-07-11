SUMMARY = "Portable Archive Exchange"
DESCRIPTION = "pax is an archiving utility specified by POSIX.1-2001. The format is \
basically tar, but with additional extended attributes."
LICENSE = "CDDL-1.0"

PV = "1.6.1"

RPM_NAME = "spax-1.6.1-47.4.aarch64.rpm"
RPM_HASH = "31041dcf712c582cd49e21b5ea2664539f4a7f50c3b61bbc4683fb2e15b751475b578df36c2d2b26fa5d67cf14839c8a9088837528d0f24b6dfe1178536338f8"

RPROVIDES:${PN} += "pax \
spax"

RDEPENDS:${PN} += "star"

inherit rpm

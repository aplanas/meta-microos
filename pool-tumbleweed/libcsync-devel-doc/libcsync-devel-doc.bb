SUMMARY = "Developer documentation for csync"
DESCRIPTION = "The libcsync-devel-doc package provides documentation for csync \
development."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync-devel-doc-0.50.0-11.10.aarch64.rpm"
RPM_HASH = "145cadef001c08fcb1effdd78d372744a6fc91d6b2b663305ea608aa214bcd0c757d0e49832293d08486a6d0343c6b3b02cead2176b613be922acda175fb37e0"

RPROVIDES:${PN} += "libcsync-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm

SUMMARY = "MIME email parser for KDE PIM"
DESCRIPTION = "This package provides libraries needed for the correct parsing of email \
messages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-mime-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "d294b328417aa55d4f26f43d8b77c3aca71c45f46e8efac58e59f702835d92c105c8e81b3e0ffb7eb4e3d63ab9fd72c57a17b5228623a10f7b3d9748ca21dfc9"

RPROVIDES:${PN} += "akonadi-mime"

RDEPENDS:${PN} += ""

inherit rpm

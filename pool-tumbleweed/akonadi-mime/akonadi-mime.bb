SUMMARY = "MIME email parser for KDE PIM"
DESCRIPTION = "This package provides libraries needed for the correct parsing of email \
messages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-mime-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "41b85550c30fc9e3df5a5c0c9ee2d006ad2118a7585d613f6224f6d3614bb3bd1631c2fbbd57630e72a45768ca7a78cf9b6a12970cb968dc268552494a66bc7e"

RPROVIDES:${PN} += "akonadi-mime"

RDEPENDS:${PN} += ""

inherit rpm

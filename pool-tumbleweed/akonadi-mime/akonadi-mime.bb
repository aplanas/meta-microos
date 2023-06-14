SUMMARY = "MIME email parser for KDE PIM"
DESCRIPTION = "This package provides libraries needed for the correct parsing of email \
messages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-mime-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "d88ab0a457ee9588d7dd4acaefaab16e359c0824cf54b7f5f56ecee33cb9f20a680334e79acf3cff084782bb3e3ea53e3af16b16a6847201b33b7a88e11fb900"

RPROVIDES:${PN} += "akonadi-mime"

RDEPENDS:${PN} += ""

inherit rpm

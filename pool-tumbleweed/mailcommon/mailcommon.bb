SUMMARY = "Base KDE PIM library for mail-handling applications"
DESCRIPTION = "The mailcommon library is a KDE PIM project to provide a \
framework to build applications which handle e-mail."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "mailcommon-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f5d11f5cdf44c0bacc04a412176be691f0ae8871b9abbd0f33a3139325dacbb764ce3e92ef9831f4e7f1ab406f92c122726b171d35f0e6cdb553f314f1c7cd24"

RPROVIDES:${PN} += "mailcommon"

RDEPENDS:${PN} += ""

inherit rpm

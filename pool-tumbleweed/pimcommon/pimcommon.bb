SUMMARY = "Base package of KDE PIM PimCommon library"
DESCRIPTION = "This package contains the pimcommon library, used by several KDE PIM \
applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "pimcommon-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "fca781a566f22ab69ced67a54c918ba63f922ba66d4ede416899b9d383b1033350261a31d6c84867fd05e514d4ca6592eed8211822b30928ee541d5ddb6a80c6"

RPROVIDES:${PN} += "pimcommon"

RDEPENDS:${PN} += ""

inherit rpm

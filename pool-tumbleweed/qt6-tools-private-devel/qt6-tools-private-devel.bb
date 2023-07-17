SUMMARY = "Non-ABI stable API for the Qt 6 tools libraries"
DESCRIPTION = "This package provides private headers of qt6-tools that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "270f94d76927c37daafc061e05f8c20295b37e2d2f80e2b805fee2a609503a36484ddb4fb9267ab6547dc2dac2dda4b7b67bb29193a482c79898323834507da7"

RPROVIDES:${PN} += "qt6-tools-private-devel"

RDEPENDS:${PN} += ""

inherit rpm

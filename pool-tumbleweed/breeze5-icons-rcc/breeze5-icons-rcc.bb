SUMMARY = "Breeze icon theme - rcc file"
DESCRIPTION = "Breeze-icons is a freedesktop.org compatible icon theme. \
This contains the Breeze (non-dark) icons in a QResource file, used by Kexi."
LICENSE = "LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "breeze5-icons-rcc-5.106.0-1.1.noarch.rpm"
RPM_HASH = "3ac7f727d031b239c75e0a7c592ceaa41c04e45f2d9fbfd71e14e86f7a858378df40a566f0f1c084733e971a471f6a42a37d5563e8f4205bed477c89eb1fa762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-icons-rcc"

RDEPENDS:${PN} += ""

inherit rpm

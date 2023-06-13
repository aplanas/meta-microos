SUMMARY = "Development documentation for PolicyKit"
DESCRIPTION = "Development documentation for PolicyKit Authorization Framework."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "polkit-doc-121-4.2.noarch.rpm"
RPM_HASH = "749e4820ae02f76c1bdb749c7d4a0bdb9eea820eda0a2273ac9562cd81fc816d981069c5f5a2c7cc8abf2c19f823c78897dca0ead00e457daa5c540386b8a192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "polkit-doc"

RDEPENDS:${PN} += ""

inherit rpm

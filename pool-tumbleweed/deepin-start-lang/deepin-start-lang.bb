SUMMARY = "Translations for package deepin-start"
DESCRIPTION = "Provides translations for the 'deepin-start' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.9.49"

RPM_NAME = "deepin-start-lang-5.9.49-3.1.aarch64.rpm"
RPM_HASH = "b06bbd45f4082d946b6a4bcbf7238ade96d1848403141611f9dce20f57aa4293c1c77a1b240c0f07baeb9c1590cc67d97c1eec4a6371e0e1e9b5c6277e10eac5"

RPROVIDES:${PN} += "deepin-start-lang"

RDEPENDS:${PN} += "deepin-start"

inherit rpm

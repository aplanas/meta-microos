SUMMARY = "Translations for package deepin-compressor"
DESCRIPTION = "Provides translations for the 'deepin-compressor' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.12.13"

RPM_NAME = "deepin-compressor-lang-5.12.13-1.4.noarch.rpm"
RPM_HASH = "1c207cf63a552317ca0b02671e07792aa1d202c73eb40cd87d61fa642140fbc2b77afbc5c0aaeb2850c3ae06e91246be8eebc9ef8169315dc1a44179ef27db03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-compressor-lang \
deepin-compressor-lang-all"

RDEPENDS:${PN} += "deepin-compressor"

inherit rpm

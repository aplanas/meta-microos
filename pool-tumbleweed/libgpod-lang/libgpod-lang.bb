SUMMARY = "Translations for package libgpod"
DESCRIPTION = "Provides translations for the 'libgpod' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod-lang-0.8.3-12.5.noarch.rpm"
RPM_HASH = "628d53f9789b8f6827d24be4cae981bf7f389d2201c5e844ca29090a0e1abad6f7ec61552dac53d090f6ad970661332acae47ae13c5835e3cc1c00c885190107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgpod-lang \
libgpod-lang-all \
locale(libgpod:de) \
locale(libgpod:es) \
locale(libgpod:fr) \
locale(libgpod:he) \
locale(libgpod:it) \
locale(libgpod:ja) \
locale(libgpod:ro) \
locale(libgpod:sv) \
locale(libgpod:zh_CN)"

RDEPENDS:${PN} += "libgpod"

inherit rpm

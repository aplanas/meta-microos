SUMMARY = "Translations for package v4l-utils"
DESCRIPTION = "Provides translations for the 'v4l-utils' package."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "v4l-utils-lang-1.24.1-1.3.noarch.rpm"
RPM_HASH = "98aa1b8b58c0d0dbd38e1c3699954515fee4ef472f4dc00b141aa5ba524b294ee6232846dab138e565e1a91a64dc61dfd230baa1ac079348fb78d27b11c81ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(v4l-utils:ca) \
locale(v4l-utils:de) \
locale(v4l-utils:fr) \
locale(v4l-utils:pt_BR) \
locale(v4l-utils:uk) \
v4l-utils-lang \
v4l-utils-lang-all"
RDEPENDS:${PN} += "v4l-utils"

inherit rpm

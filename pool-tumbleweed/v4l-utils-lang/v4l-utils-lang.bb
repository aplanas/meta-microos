SUMMARY = "Translations for package v4l-utils"
DESCRIPTION = "Provides translations for the 'v4l-utils' package."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "v4l-utils-lang-1.24.1-1.4.noarch.rpm"
RPM_HASH = "38f9820d5c1cd8e6660a51f25fb0b2cdf52ab7ba128d5883fb386f966d5d04d3b4534dd5ff606187be44aa40909256957944821787a0c958c885c26ece9dc49b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-v4l-utils-ca \
locale-v4l-utils-de \
locale-v4l-utils-fr \
locale-v4l-utils-pt-BR \
locale-v4l-utils-uk \
v4l-utils-lang \
v4l-utils-lang-all"

RDEPENDS:${PN} += "v4l-utils"

inherit rpm

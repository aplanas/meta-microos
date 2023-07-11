SUMMARY = "Translations for package colorpicker"
DESCRIPTION = "Provides translations for the 'colorpicker' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.5"

RPM_NAME = "colorpicker-lang-1.1.5-1.18.noarch.rpm"
RPM_HASH = "938e6cbe509c55823b7f4ad362bf01f3296a256b94b9c9cb84e5e3f2c6ed9e660319c6277e1e2770cde06a0f0906e8ee6ac8f20ec09a6a303416d5c819bc8e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colorpicker-lang \
colorpicker-lang-all \
locale-colorpicker-bg \
locale-colorpicker-ca \
locale-colorpicker-de \
locale-colorpicker-es \
locale-colorpicker-fr \
locale-colorpicker-nl \
locale-colorpicker-pl \
locale-colorpicker-pt-PT \
locale-colorpicker-tr"

RDEPENDS:${PN} += "colorpicker"

inherit rpm

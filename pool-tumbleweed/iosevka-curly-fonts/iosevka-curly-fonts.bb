SUMMARY = "Iosevka in monospace curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly typeface (curly style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-curly-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "b0f1170e3797b002574bb0fcfc03aedbe847f01fcf9f714d20ab8cecb14bd2235e515846be0886a3e59fb301ca2733cc6316b3a9f54916bdd85decd15028feec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

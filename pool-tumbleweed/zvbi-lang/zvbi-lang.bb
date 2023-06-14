SUMMARY = "Translations for package zvbi"
DESCRIPTION = "Provides translations for the 'zvbi' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.41"

RPM_NAME = "zvbi-lang-0.2.41-2.1.noarch.rpm"
RPM_HASH = "d06840e9a11c90d6bdcdcf217e6484ec2e1b02d6778e2826c4a5709ae1b043ab22810b6e89e72dc4e45802a8329bb4e36ea1c864a2487b797b2c461e19556aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zvbi-de \
locale-zvbi-en@boldquot \
locale-zvbi-en@quot \
locale-zvbi-es \
locale-zvbi-fr \
locale-zvbi-it \
locale-zvbi-ka \
locale-zvbi-nl \
locale-zvbi-pl \
zvbi-lang \
zvbi-lang-all"

RDEPENDS:${PN} += "zvbi"

inherit rpm

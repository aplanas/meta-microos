SUMMARY = "Translations for package spice-up"
DESCRIPTION = "Provides translations for the 'spice-up' package."
LICENSE = "GPL-3.0-only"

PV = "1.9.1"

RPM_NAME = "spice-up-lang-1.9.1-1.8.noarch.rpm"
RPM_HASH = "67b1165aa281f2d98dbb9925f604eea5165d0f238a3aee6993f022ba202070d55b0c84c9c18c510f59b2b52de640eb5b113bb2de06caa1c93fd88e9db1729a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-spice-up-ca \
locale-spice-up-de \
locale-spice-up-es \
locale-spice-up-fr \
locale-spice-up-ja \
locale-spice-up-pt-BR \
locale-spice-up-pt-PT \
locale-spice-up-sr \
locale-spice-up-sr@latin \
spice-up-lang \
spice-up-lang-all"

RDEPENDS:${PN} += "spice-up"

inherit rpm

SUMMARY = "Translations for package gupnp-tools"
DESCRIPTION = "Provides translations for the 'gupnp-tools' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.1"

RPM_NAME = "gupnp-tools-lang-0.12.1-1.1.noarch.rpm"
RPM_HASH = "133a8599a1814f40a80494f2ec9d8ac87b4cd59c01efd51b1724fe6598d26d286c116684d3a8cec46023042b866c43d74b60b7bb15c06ba8a543991605b33b49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gupnp-tools-lang \
gupnp-tools-lang-all \
locale-gupnp-tools-bs \
locale-gupnp-tools-cs \
locale-gupnp-tools-da \
locale-gupnp-tools-de \
locale-gupnp-tools-el \
locale-gupnp-tools-es \
locale-gupnp-tools-eu \
locale-gupnp-tools-fur \
locale-gupnp-tools-hu \
locale-gupnp-tools-id \
locale-gupnp-tools-ja \
locale-gupnp-tools-ka \
locale-gupnp-tools-pl \
locale-gupnp-tools-pt \
locale-gupnp-tools-pt-BR \
locale-gupnp-tools-ro \
locale-gupnp-tools-sk \
locale-gupnp-tools-sl \
locale-gupnp-tools-sr \
locale-gupnp-tools-sr@latin \
locale-gupnp-tools-sv \
locale-gupnp-tools-tr \
locale-gupnp-tools-uk \
locale-gupnp-tools-zh-CN"

RDEPENDS:${PN} += "gupnp-tools"

inherit rpm

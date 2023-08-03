SUMMARY = "Translations for package gupnp-tools"
DESCRIPTION = "Provides translations for the 'gupnp-tools' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.0"

RPM_NAME = "gupnp-tools-lang-0.12.0-2.1.noarch.rpm"
RPM_HASH = "6df9f3e950246c2703438ac8a897fa64fe86a49638eb2b54dda57f17dd35932a85b03530e87398bff4b1185903698f90408dc9b57e98ba3fd102c552089f5d23"
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

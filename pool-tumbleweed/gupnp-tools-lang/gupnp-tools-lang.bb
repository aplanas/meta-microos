SUMMARY = "Translations for package gupnp-tools"
DESCRIPTION = "Provides translations for the 'gupnp-tools' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.0"

RPM_NAME = "gupnp-tools-lang-0.12.0-1.3.noarch.rpm"
RPM_HASH = "b0b5c08f9360bf1ddc39cce89287aa822f1c5a61ab823d063df8886f950ad38e421e0a61f92a7104c55f92efe24ea7df2be75ab7d7c89a128723a7577c8cbd5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gupnp-tools-lang \
gupnp-tools-lang-all \
locale(gupnp-tools:bs) \
locale(gupnp-tools:cs) \
locale(gupnp-tools:da) \
locale(gupnp-tools:de) \
locale(gupnp-tools:el) \
locale(gupnp-tools:es) \
locale(gupnp-tools:eu) \
locale(gupnp-tools:fur) \
locale(gupnp-tools:hu) \
locale(gupnp-tools:id) \
locale(gupnp-tools:ja) \
locale(gupnp-tools:pl) \
locale(gupnp-tools:pt) \
locale(gupnp-tools:pt_BR) \
locale(gupnp-tools:ro) \
locale(gupnp-tools:sk) \
locale(gupnp-tools:sl) \
locale(gupnp-tools:sr) \
locale(gupnp-tools:sr@latin) \
locale(gupnp-tools:sv) \
locale(gupnp-tools:tr) \
locale(gupnp-tools:uk) \
locale(gupnp-tools:zh_CN)"
RDEPENDS:${PN} += "gupnp-tools"

inherit rpm

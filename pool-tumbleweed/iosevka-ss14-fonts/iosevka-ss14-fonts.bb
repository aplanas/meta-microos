SUMMARY = "Iosevka in monospace, JetBrains Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS14 typeface (monospace, JetBrains Mono \
style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-ss14-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "6d63b4a45776df04f7d0ee87fd6129ec8a10d76cc2e6b60d563e6901a21ef3c850c55afb465a7d894c161d54c29a501dd68d5ee5ab59d459945f2c337ac97e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss14-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

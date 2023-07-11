SUMMARY = "Iosevka in monospace, Envy Code R style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS10 typeface (monospace, Envy Code R style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss10-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "99646cd61e67dd617b7d5cbb087045fdaf069ed65d9c9ad92bd8fc6a3ebf1df9f62a88e06153d419fdf0ace131b83246602d4a397516a1e5db4b7915d318a4ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss10-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

SUMMARY = "Iosevka in monospace curly style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka Curly typeface (curly style)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-curly-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "b09de28e0c4acf8c32780d6a3ab0aa109a6efbaf33159a131975ac38fbdd0533629d05960426b8b697091800436464e549063822907ab8545971154c10387906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-curly-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

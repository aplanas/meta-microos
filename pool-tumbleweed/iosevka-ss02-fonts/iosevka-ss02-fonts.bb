SUMMARY = "Iosevka in monospace, Anonymous Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS02 typeface (monospace, Anonymous Pro \
style)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-ss02-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "c8edc88efe588f05788a58f7c9000abca8348ce5b33eeb1a7b91e776fc4d8749adfa95e920ac202b67df8550245f371ec6ea0fe32ee0d6d5a6c700181c736bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss02-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

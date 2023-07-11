SUMMARY = "Iosevka in monospace, Pragmata Pro style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS08 typeface (monospace, Pragmata Pro \
style)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-ss08-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "ce614efa758b02cf0d4d8147e0c5c7df905781464271fdcc30bb39f1eadd60cc3434d7cdd4ff8e398e77633a621968ebbed3fc92e12d493c6ded177c2d6b6a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss08-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

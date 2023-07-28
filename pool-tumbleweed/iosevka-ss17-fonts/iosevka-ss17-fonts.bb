SUMMARY = "Iosevka in monospace, Recursive Mono style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS17 typeface (monospace, Recursive Mono \
style)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-ss17-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "91e04e2354dff2c6793aa77978f2325dcd0c22efbd658ca330efb1dacb10761429895a82525b117fba608ac2d7a90a231302362e8364f23bf4cfcc958027790b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss17-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

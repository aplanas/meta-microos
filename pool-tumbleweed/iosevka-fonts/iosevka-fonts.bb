SUMMARY = "Slender typeface for source code"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka typeface (monospace, default)."
LICENSE = "OFL-1.1"

PV = "26.1.0"

RPM_NAME = "iosevka-fonts-26.1.0-1.1.noarch.rpm"
RPM_HASH = "eb2f090f7f72de1d169d2dc2af5188e8e2e9d363d20bcc870ff58547eef1aa240a35900cc9f857711158e1d622ba0dec1bf5ff6e3d4f7acc9709cb991b33fddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm

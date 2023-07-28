SUMMARY = "Slender typeface for source code"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka typeface (monospace, default)."
LICENSE = "OFL-1.1"

PV = "25.0.1"

RPM_NAME = "iosevka-fonts-25.0.1-1.1.noarch.rpm"
RPM_HASH = "e7d9edb4e9cca44f5a51d2d96ba914d4a7c9c2c58e2729d229a5b67a6d5d1afcde89eac9636a712f0e9eb38e698319a0828bd50c9c6221d93c05590be444e12e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm

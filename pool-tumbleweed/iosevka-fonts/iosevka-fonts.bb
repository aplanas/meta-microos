SUMMARY = "Slender typeface for source code"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka typeface (monospace, default)."
LICENSE = "OFL-1.1"

PV = "25.1.1"

RPM_NAME = "iosevka-fonts-25.1.1-1.1.noarch.rpm"
RPM_HASH = "d577db382c784b8d3e83d1b7a51bc4cc2d6257a1dd317414d0e516cbbf32e6305e11a2d068a03e398d3e10b989a4ec5083e06e8e7a1d5aaeb4c839630e59e224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm

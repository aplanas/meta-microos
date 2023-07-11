SUMMARY = "Slender typeface for source code"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka typeface (monospace, default)."
LICENSE = "OFL-1.1"

PV = "24.1.4"

RPM_NAME = "iosevka-fonts-24.1.4-1.1.noarch.rpm"
RPM_HASH = "5755307f2053d6852b744dafb4680cb404e4d38075249685af572b261f75a24ec7ace46067db42d551ad13cc65d2e2dbbfb272ff092d397373e131ba50e1ff1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm

SUMMARY = "Slender typeface for source code"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka typeface (monospace, default)."
LICENSE = "OFL-1.1"

PV = "24.0.0"

RPM_NAME = "iosevka-fonts-24.0.0-1.1.noarch.rpm"
RPM_HASH = "9e4e779b503d59eb16c804d4e104e60670c51339ee6976d6f0495884b8d6fb46f3c0750faa5d47c9f3a7b0cde17e41bbdde09d8492846f633214223839b6f723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm

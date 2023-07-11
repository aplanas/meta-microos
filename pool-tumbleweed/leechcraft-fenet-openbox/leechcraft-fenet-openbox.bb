SUMMARY = "OpenBox Window Manager integration for LeechCraft"
DESCRIPTION = "This package allows to start Leechcraft as a Desktop Environment with \
the Openbox Window Manager."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-fenet-openbox-0.6.70+git.14794.g33744ae6ce-3.2.noarch.rpm"
RPM_HASH = "0eac91b9bdd574cb63362143b460739ce33c538aeac4ed9edf9db9855faf2ff8af3d3c3ad2978310d270a5442ccbc35d29aa6592d01a90b8ac87953aca7f1fba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-fenet-openbox \
leechcraft-fenet-wm"

RDEPENDS:${PN} += "/usr/bin/sh \
leechcraft-fenet \
openbox"

inherit rpm

SUMMARY = "GNU Unifont Japanese (OpenType Format)"
DESCRIPTION = "The GNU Unifont by Roman Czyborra. \
Unifont Japanese OpenType Version."
LICENSE = "GPL-2.0-or-later | OFL-1.1"

PV = "15.0.01"

RPM_NAME = "gnu-unifont-jp-otf-fonts-15.0.01-2.1.noarch.rpm"
RPM_HASH = "40e1c1d16fafedf92887b4069a748316fa3007038c1bbd8660b6e1df802328b0afb87306000e6948f5d94345649c9b449178c2c4819e3f101ab5e1dd578f3a00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-unifont-jp-otf-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm

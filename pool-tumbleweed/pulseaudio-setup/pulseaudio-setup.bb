SUMMARY = "Set-up script for PulseAudio"
DESCRIPTION = "This package contains a setup script for making PulseAudio working with \
various applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-setup-16.1-4.1.aarch64.rpm"
RPM_HASH = "d67464ee62c1b1d45824680abfb050aaa1c981c6f93226490cd25afcebca0551b57491321580576242f66374a9334ad40fb2f90b35c107ed741e645d10c751b5"

RPROVIDES:${PN} += "pulseaudio-setup"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup"

inherit rpm

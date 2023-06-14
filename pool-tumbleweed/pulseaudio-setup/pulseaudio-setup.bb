SUMMARY = "Set-up script for PulseAudio"
DESCRIPTION = "This package contains a setup script for making PulseAudio working with \
various applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-setup-16.1-3.1.aarch64.rpm"
RPM_HASH = "a1c4221febb38d51131effb94b04f3d50a95489fbad7a411d6c9c19968da37455ae44baf881adcdfafe32b9cd0f7ae88ad4e4de6cca05fc20bc649db40eefa2f"

RPROVIDES:${PN} += "pulseaudio-setup"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup"

inherit rpm

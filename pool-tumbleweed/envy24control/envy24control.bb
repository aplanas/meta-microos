SUMMARY = "Control tool for Envy24 (ice1712) based soundcards"
DESCRIPTION = "envy24control is a GUI control tool for Envy24 (ice1712) based sound cards."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "envy24control-0.6.0-24.4.aarch64.rpm"
RPM_HASH = "3fc8640ed58aeb0399aecaadc190398e7a01a1a31d2024ebc1d8566d2e1651f525986603a3adf4b4038724dabde69b4b20356446de9f09913ff612712e31f8d1"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/envy24control \
envy24control"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm

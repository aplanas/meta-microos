SUMMARY = "Development files for mate-sensors-applet"
DESCRIPTION = "MATE Sensors Applet is an applet for the MATE Panel to display \
readings from hardware sensors, including CPU temperature, fan \
speeds and voltage readings under Linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-applet-sensors-devel-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "f2212c14382fb03b1329db1b050994cfbda2a07cdd36ccdd47cce5ed41bb084d4deef98ea35602a1bf9875f395447fa142e6962563f3575f9bb96d09b2497d4d"

RPROVIDES:${PN} += "mate-applet-sensors-devel \
mate-sensors-applet-devel"

RDEPENDS:${PN} += "libmate-sensors-applet-plugin0"

inherit rpm

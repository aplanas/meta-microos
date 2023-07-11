SUMMARY = "Deepin Desktop branding setting for lightdm"
DESCRIPTION = "Deepin Desktop branding setting for lightdm"
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-lightdm-5.14.45-2.5.aarch64.rpm"
RPM_HASH = "b74b05384a7ad93a052b825fac68dad9bf04cdda6d97a6852b00df4cd6603a3c25218bd71049011eaabc75c0df505c0bb3c468565b4ca502d95b9a7d69eb6622"

RPROVIDES:${PN} += "deepin-daemon-lightdm"

RDEPENDS:${PN} += "deepin-daemon \
lightdm"

inherit rpm

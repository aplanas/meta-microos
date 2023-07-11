SUMMARY = "A collection of plugins for Eye of GNOME"
DESCRIPTION = "This package contains plugins for additional features in Eye of GNOME."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugins-44.0-1.2.aarch64.rpm"
RPM_HASH = "b6c9337ec5e4c0dc0b3d7e23803a255708112a38cbb7bf46f7139ad050e8c35e089d9eae85517f14190fbb7b59bafd021e07217d69e014dd5dfb474802931410"

RPROVIDES:${PN} += "eog-plugins"

RDEPENDS:${PN} += "eog"

inherit rpm

SUMMARY = "Icon theme inspired by Tango and Elementary"
DESCRIPTION = "This is an icon-theme maintained with Xfce in mind, \
but it supports other desktops like Gnome3 as well. \
It's a fork of the upstream elementary-project, \
which took place because the team decided to \
drop a lot of desktop-specific symlinks."
LICENSE = "GPL-2.0-only"

PV = "0.15.2+git0.2e2ca316"

RPM_NAME = "elementary-xfce-icon-theme-0.15.2+git0.2e2ca316-1.12.noarch.rpm"
RPM_HASH = "801b2e7bdaa36b0ff1a57058cdc5b59000c77ef919beb3ad4c7bff20173c83b9a23fa790c2d07d2dc061d86ff7072cb3b37aca8236eeadbab54c2f60b2d5e862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elementary-xfce-icon-theme"

RDEPENDS:${PN} += "adwaita-icon-theme \
gtk3-tools \
hicolor-icon-theme"

inherit rpm

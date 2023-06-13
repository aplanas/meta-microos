SUMMARY = "Adapta GNOME Shell themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the GNOME Shell themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "gnome-shell-theme-adapta-3.95.0.11-3.5.noarch.rpm"
RPM_HASH = "b9c02aca4292092f80b2581f4274ee870c73db4a737c0de36f4ce0352a23761725f8db627f99c6d52afb72649537af900d3ab57cac6282ca84a342478f7e5b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-theme-adapta"

RDEPENDS:${PN} += "gnome-shell \
metatheme-adapta-common"

inherit rpm

SUMMARY = "Config schema for GDM"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-schema-44.1-1.1.noarch.rpm"
RPM_HASH = "64742b648487b778274b6d6e15566efa1f63602a595c2f565de0556fbf241e02a79fcfc266cd264da9ee5609ac21ed71c7e069bfa85a7273eadc586ee4274f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdm-schema"
RDEPENDS:${PN} += ""

inherit rpm

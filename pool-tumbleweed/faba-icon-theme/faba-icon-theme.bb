SUMMARY = "Faba Icon theme"
DESCRIPTION = "Faba is a modern icon theme with Tango influences."
LICENSE = "LGPL-3.0-or-later | CC-BY-SA-4.0"

PV = "4.3"

RPM_NAME = "faba-icon-theme-4.3-1.8.noarch.rpm"
RPM_HASH = "abc153e522d30ae29ebffb811690a8e9e2f01c8387aec28aab1215f9d0994445a06bb6074a07da2d439e76809d4b1a92e049352a9726464c9450d89997b2054c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faba-icon-theme"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-icon-theme"

inherit rpm

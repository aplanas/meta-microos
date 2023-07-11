SUMMARY = "Documentation for Advanced Gtk+ Sequencer"
DESCRIPTION = "Advanced Gtk+ Sequencer library development documentation."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "5.4.0"

RPM_NAME = "gsequencer-devel-doc-5.4.0-1.1.noarch.rpm"
RPM_HASH = "80543bd35e88706895f251fbb0a7126f57667a3cfc2d4ba9e770bb5a116a4e8a76735f5ba79c651dda7d6cbc62caf599c81124f6ad14619aa885ba89114ed30e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsequencer-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm

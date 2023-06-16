SUMMARY = "Tux Cursors!"
DESCRIPTION = "A cursor set that has nice animated penguins."
LICENSE = "GPL-2.0-only"

PV = "0.5"

RPM_NAME = "tuxcursors-0.5-88.1.noarch.rpm"
RPM_HASH = "3249115ff3dc4f6d31c8f2e7031d863d1f13eed75380e518328980b54976ad49c69fc68fd298e2e96868d078a603c0afc14901bf6407dc24d8e494416f1f5a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxcursors"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm

SUMMARY = "Rustrad input method for IBus framework"
DESCRIPTION = "ibus-table-rustrad provides Rustrad input method on IBus Table under IBus \
framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-rustrad-1.3.16-1.1.noarch.rpm"
RPM_HASH = "9fff3a3e46078756b692ffb2f51ed082398d0b26ce46b24029c96a0b475a051caa5f4207e43942e9fc3fee561a3ffed927461e50f7e18b0c5fd3441a2c420573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-rustrad \
locale-ibus-ru"

RDEPENDS:${PN} += "ibus-table"

inherit rpm

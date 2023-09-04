SUMMARY = "Busybox applets replacing kbd"
DESCRIPTION = "This package contains the symlinks to replace kbd with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-kbd-1.36.1-28.1.noarch.rpm"
RPM_HASH = "58fa0f61009ae457e24642df3a56491e7107301dd9e736dcd0c7f43f00074d2ca220931ad4dbc0677f7c37b712956393acff1fb17e9abd0f6357fdd569a7fd53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-kbd"

RDEPENDS:${PN} += "busybox"

inherit rpm

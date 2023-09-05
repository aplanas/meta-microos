SUMMARY = "Busybox applets replacing ed"
DESCRIPTION = "This package contains the symlinks to provide ed with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-ed-1.36.1-29.1.noarch.rpm"
RPM_HASH = "1a685421cf0d1af637df90736723782c7c6821697a8ea2ec976e2fb6147b70ccc1b38502a0fe56f2a502cc27aecbb4c1d564231aa9fd0ec3b6216b87f11f12d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-ed"

RDEPENDS:${PN} += "busybox"

inherit rpm

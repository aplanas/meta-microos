SUMMARY = "Busybox applets replacing netcat"
DESCRIPTION = "This package contains the symlinks to provide nc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-netcat-1.36.1-27.1.noarch.rpm"
RPM_HASH = "1859ccaad2469a0ca02d006a877e62e5fde3854c5f52536d02fc2e1bf8add594d17e084adb4f8adf4f27b3d9b374fe91f7acf7cd25739e60148e93e30a1fd3e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-netcat"

RDEPENDS:${PN} += "busybox"

inherit rpm

SUMMARY = "Busybox applets replacing which"
DESCRIPTION = "This package contains the symlinks to replace which with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-which-1.36.1-27.1.noarch.rpm"
RPM_HASH = "488d71721ddb817445c7db6afd632feaae62bf1e7cdc6431e3163dfb480bc568b2d99c47dcb73627661f9d94cc96bc57c7bcdeaf167d11a80df811b8327aca96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-which"

RDEPENDS:${PN} += "busybox"

inherit rpm

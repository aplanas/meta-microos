SUMMARY = "Busybox applets replacing hexedit"
DESCRIPTION = "This package contains the symlinks to replace hexedit with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-hexedit-1.36.1-27.1.noarch.rpm"
RPM_HASH = "29365bbe4d325697ef53341dc972f5519cae20e734f03816aa10aacc5453df2fe3c88cd8f54a27784c187ae8a481fe2ba26f712d58e6d8cdd32b558f66c1db02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-hexedit"

RDEPENDS:${PN} += "busybox"

inherit rpm

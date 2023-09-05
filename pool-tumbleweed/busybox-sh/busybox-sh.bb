SUMMARY = "Busybox sh, ash and hush"
DESCRIPTION = "This package contains the busybox sh, ash and hush."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sh-1.36.1-29.1.noarch.rpm"
RPM_HASH = "3eae37f70b7ef8ff9030dbb98eb1d9f7e78e7c07d512b829b9b6964c30dff9f51e77bdd2861eb5c3d4c2a3001b00d4167a18bdb0dfbf410b26975786b7064c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
busybox-sh"

RDEPENDS:${PN} += "busybox"

inherit rpm

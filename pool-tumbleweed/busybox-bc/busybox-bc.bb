SUMMARY = "Busybox applets replacing bc"
DESCRIPTION = "This package contains the symlinks to provide bc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-bc-1.36.1-28.1.noarch.rpm"
RPM_HASH = "79acbcf068595f2154b839d7d97475ac4a782b2e2bf4c86c229e1706039c1cf0cdbe58ccc2a2e944313ed6e08635f36926e74f86a401ebc822c3272a4c27f3ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bc"

RDEPENDS:${PN} += "busybox"

inherit rpm

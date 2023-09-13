SUMMARY = "Busybox applets replacing less"
DESCRIPTION = "This package contains the symlinks to replace less with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-less-1.36.1-30.1.noarch.rpm"
RPM_HASH = "6f8eb8174c18ebc6697662a879c3cd97ceb48962cafbfb143dbddfe87559433edd134c227914f86f425689e33f15215ca9467299ead3312bf935cbac2f884837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-less"

RDEPENDS:${PN} += "busybox"

inherit rpm

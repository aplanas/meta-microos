SUMMARY = "Busybox applets replacing hexedit"
DESCRIPTION = "This package contains the symlinks to replace hexedit with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-hexedit-1.36.0-26.3.noarch.rpm"
RPM_HASH = "b6a5ab0fef58cb93996ef35ce780d765f9ac2eda4dad978249f189efa083c963d74a231aad25ea8ff13a52dd38164919d961bdf30b4bacf98b9612398b3cc220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-hexedit"

RDEPENDS:${PN} += "busybox"

inherit rpm

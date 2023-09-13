SUMMARY = "Busybox applets replacing unzip"
DESCRIPTION = "This package contains the symlinks to replace unzip with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-unzip-1.36.1-30.1.noarch.rpm"
RPM_HASH = "2dd70c7bcdd043b9a0c861ceeea584d21845bb52c157a89a60be5e1f6672afff6f2446846bf6547fc64560e0459533b535e8b153461ccf9bed2f6aa7f37445d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-unzip"

RDEPENDS:${PN} += "busybox"

inherit rpm

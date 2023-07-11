SUMMARY = "Busybox applets replacing cpio"
DESCRIPTION = "This package contains the symlinks to replace cpio with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-cpio-1.36.1-27.1.noarch.rpm"
RPM_HASH = "bd53d9b90e6a8b8edd580804633193dc0b9edf28cbdbfb2f85986f52cec05d72d55199d86d4cd99103cfd2ea7e2ffd881308ddaf8fe2faff5e3b33340dd63243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-cpio"

RDEPENDS:${PN} += "busybox"

inherit rpm

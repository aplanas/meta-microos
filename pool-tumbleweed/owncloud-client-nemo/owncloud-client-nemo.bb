SUMMARY = "Nemo overlay icons"
DESCRIPTION = "This package provides overlay icons to visualize the synchronization state \
in the Nemo file manager."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "owncloud-client-nemo-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "f2f29e4341384e43444e08d93135f1ed08272a08cfd794cf5d8a4d9933d92731ec0a05a02fd3b1dd2aed7abadcf3210cd2aaf76283310f6c7e37a7bfb9a56ada"

RPROVIDES:${PN} += "owncloud-client-nemo"

RDEPENDS:${PN} += "nemo \
owncloud-client \
python-nemo"

inherit rpm

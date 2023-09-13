SUMMARY = "Caja overlay icons"
DESCRIPTION = "This package provides overlay icons to visualize the synchronization state \
in the Caja file manager."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "owncloud-client-caja-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "b52b835a00df6a3c1dea53d4906ec5f08eb878a498ddda35c60a50135f78581b23608f5791a8c34fd1dac1817d87aa6af58febde461c7edea60156b227b2e85f"

RPROVIDES:${PN} += "owncloud-client-caja"

RDEPENDS:${PN} += "nemo \
owncloud-client \
python-caja"

inherit rpm

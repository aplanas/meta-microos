SUMMARY = "System container rootfs creation tool"
DESCRIPTION = "Provides a way to create the root file system to use for \
libvirt containers."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "python3-virt-bootstrap-1.1.1-7.1.noarch.rpm"
RPM_HASH = "6b0f4cf22503c357a86ec78c40500765138d17c53942493207e86c5f60129ffc625ea87b14017e9ab1d8303e871a74c59e5cecb11ae7f34fbb52507a18414a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-virt-bootstrap \
python3.11dist-virt-bootstrap \
python3dist-virt-bootstrap"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-libguestfs \
python3-passlib \
skopeo \
update-alternatives \
virt-sandbox"

inherit rpm

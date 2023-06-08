SUMMARY = "Image Building Tools for OpenStack"
DESCRIPTION = "diskimage-builder is a tool for automatically building customized \
operating-system images for use in clouds and other environments. \
 \
It includes support for building images based on many major \
distributions and can produce cloud-images in all common formats \
(qcow2, vhd, raw, etc), bare metal file-system images and ram-disk \
images. These images are composed from the many included elements; \
diskimage-builder acts as a framework to easily add your own elements \
for even further customization."
LICENSE = "Apache-2.0"

PV = "3.26.0"

RPM_NAME = "diskimage-builder-3.26.0-1.2.noarch.rpm"
RPM_HASH = "25b83d506f7ce7e83998a964922b3fdd5930d1597582ad3d59d3b70028a4626907778b2b5ec12167b5ec3d65f7664e496613ce9f19ce93523886a32546116aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diskimage-builder python3.10dist(diskimage-builder) python3dist(diskimage-builder)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 kpartx python(abi) python3-Babel python3-PyYAML python3-networkx python3-six python3-stevedore qemu-tools sudo"

inherit rpm

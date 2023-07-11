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

RPM_NAME = "diskimage-builder-3.26.0-1.3.noarch.rpm"
RPM_HASH = "b23d9c79972069f9ea4e7675b7c8a412b45b7de3664d0b1de7fc8d1aacb38c1fc353d71668cd82eb2820e239f5a689bdc6652c385cf64a6820c839b8248f4c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diskimage-builder \
python3.11dist-diskimage-builder \
python3dist-diskimage-builder"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
kpartx \
python-abi \
python3-Babel \
python3-PyYAML \
python3-networkx \
python3-six \
python3-stevedore \
qemu-tools \
sudo"

inherit rpm

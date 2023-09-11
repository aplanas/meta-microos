SUMMARY = "Tools to create OVA files from raw disk images"
DESCRIPTION = "Tools to create OVA files from raw disk images. This includes 'vmdk-convert' \
to create VMDKs from raw disk images, and 'ova-compose' to create OVA files \
that can be imported by VMware vSphere or Fusion and Workstation."
LICENSE = "Apache-2.0"

PV = "0.3.1.0"

RPM_NAME = "open-vmdk-0.3.1.0-1.1.aarch64.rpm"
RPM_HASH = "36332be744938a97296d77fd0397f281160c17e414bd8e440ddf6e0fdf0db2059a81e46786c519d3f9bbfacce73dd13e0f8724987b5101008e7353266219afbe"

RPROVIDES:${PN} += "config-open-vmdk \
open-vmdk"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
coreutils \
grep \
libc.so.6 \
libz.so.1 \
python3-PyYAML \
python3-lxml \
sed \
tar \
util-linux"

inherit rpm

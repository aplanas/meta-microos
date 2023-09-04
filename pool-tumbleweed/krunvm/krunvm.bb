SUMMARY = "Manage lightweight VMs created from OCI images"
DESCRIPTION = "Manage lightweight VMs created from OCI images"
LICENSE = "Apache-2.0"

PV = "0.2.3+git12dac81"

RPM_NAME = "krunvm-0.2.3+git12dac81-2.1.aarch64.rpm"
RPM_HASH = "83173f23d8d2802917d38e93e14a1b8ffe682df702dac6d0e1340e45b6084903c6eb750e9bac944cd57c9ee298607e284e433f7248e7a63cbcbf71f3671741b0"

RPROVIDES:${PN} += "krunvm"

RDEPENDS:${PN} += "buildah \
libc.so.6 \
libgcc-s.so.1 \
libkrun.so.1 \
libkrun1 \
libm.so.6"

inherit rpm

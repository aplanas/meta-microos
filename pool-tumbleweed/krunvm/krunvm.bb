SUMMARY = "Manage lightweight VMs created from OCI images"
DESCRIPTION = "Manage lightweight VMs created from OCI images"
LICENSE = "Apache-2.0"

PV = "0.2.3+git12dac81"

RPM_NAME = "krunvm-0.2.3+git12dac81-1.4.aarch64.rpm"
RPM_HASH = "b374a0348ab2ef52a3e2aa611bc97c96844eb4a2b724cf7c6442bfc4c1797373c3848e3aa482e68c881c469b866768e5d777cc00f25642ba317f8556566a8ddf"

RPROVIDES:${PN} += "krunvm"

RDEPENDS:${PN} += "buildah \
libc.so.6 \
libgcc-s.so.1 \
libkrun.so.1 \
libkrun1 \
libm.so.6"

inherit rpm

SUMMARY = "Userspace interface to kernel DRM services for Vivante chips"
DESCRIPTION = "libdrm is a library for accessing the Direct Rendering Manager on \
Linux, BSD and other operating systems. \
 \
This package provides userspace interface to kernel DRM services \
for Vivante chips."
LICENSE = "MIT"

PV = "2.4.115"

RPM_NAME = "libdrm_etnaviv1-2.4.115-2.3.aarch64.rpm"
RPM_HASH = "6dceb0dc2422b1d950af8cbc69883f0461cfaea810f49fd8adb35d0d061eb9249bdded3bd1f1d9f638c7ce3dce09ed18eec7581f54336a1ca98e78322d416415"

RPROVIDES:${PN} += "libdrm-etnaviv.so.1 \
libdrm-etnaviv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2"

inherit rpm

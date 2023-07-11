SUMMARY = "Chromium vboot"
DESCRIPTION = "VBoot contains verified boot reference implementation and \
helper tools for Chrome OS devices."
LICENSE = "BSD-3-Clause"

PV = "78.12499"

RPM_NAME = "vboot-78.12499-5.5.aarch64.rpm"
RPM_HASH = "935bf48c47f801081348e27f13c5b2945936f4050fb3d666926366dcef3ff4687f656b5270c828d27ed8c09897b68788a377d35ec6d2c5b05f7ec8aed615acbe"

RPROVIDES:${PN} += "vboot"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libuuid.so.1"

inherit rpm

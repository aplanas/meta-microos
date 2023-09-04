SUMMARY = "Kernel firmware files for Broadcom network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Broadcom network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230814"

RPM_NAME = "kernel-firmware-bnx2-20230814-1.1.noarch.rpm"
RPM_HASH = "2ac3f40442ca449267f6d2d1ae042687d09645d0854af11849ac404beaf057e3ce3c1b6f3089e307d90c46fb7d15673040da3d3d2b2e86cc2687a65a578d2eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-bnx2/bnx2-mips-06-6.2.3.fw \
firmware-bnx2/bnx2-mips-09-6.2.1b.fw \
firmware-bnx2/bnx2-rv2p-06-6.0.15.fw \
firmware-bnx2/bnx2-rv2p-09-6.0.17.fw \
firmware-bnx2/bnx2-rv2p-09ax-6.0.17.fw \
firmware-bnx2x/bnx2x-e1-7.13.1.0.fw \
firmware-bnx2x/bnx2x-e1-7.13.11.0.fw \
firmware-bnx2x/bnx2x-e1-7.13.15.0.fw \
firmware-bnx2x/bnx2x-e1-7.13.21.0.fw \
firmware-bnx2x/bnx2x-e1h-7.13.1.0.fw \
firmware-bnx2x/bnx2x-e1h-7.13.11.0.fw \
firmware-bnx2x/bnx2x-e1h-7.13.15.0.fw \
firmware-bnx2x/bnx2x-e1h-7.13.21.0.fw \
firmware-bnx2x/bnx2x-e2-7.13.1.0.fw \
firmware-bnx2x/bnx2x-e2-7.13.11.0.fw \
firmware-bnx2x/bnx2x-e2-7.13.15.0.fw \
firmware-bnx2x/bnx2x-e2-7.13.21.0.fw \
kernel-firmware-bnx2"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm

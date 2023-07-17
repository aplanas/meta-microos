SUMMARY = "Kernel firmware files for Broadcom network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Broadcom network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230707"

RPM_NAME = "kernel-firmware-bnx2-20230707-1.1.noarch.rpm"
RPM_HASH = "4f908c688363de5f2bb62cb28bb7e1a6277600058244146c87a26f5434f40e1ac86f5a142c7a1979d0b024f2478fc540dc7f8d23e1f93403371efe74d6cc256b"
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

SUMMARY = "Storage Fixup Script"
DESCRIPTION = "storage-fixup executes fixup commands for devices matched using dmi and \
hal properties.  This is primarily to adjust too aggressive ATA APM \
settings which makes the drive unload its head frequently shortening \
its lifespan."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "storage-fixup-0.2-50.10.noarch.rpm"
RPM_HASH = "97a1f7a309d9e1078a257e7c9cdd39c7450c12769b2158dd5b8df2e285bf5d42db053a5523a0ed4b1232f18f271c9bb5d46b0dabf2fc6e6acd743713af4c8336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-storage-fixup \
storage-fixup"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
coreutils \
dmidecode \
hdparm \
scsi \
sed \
smartmontools \
systemd"

inherit rpm

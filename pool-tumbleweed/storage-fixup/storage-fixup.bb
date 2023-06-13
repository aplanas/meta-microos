SUMMARY = "Storage Fixup Script"
DESCRIPTION = "storage-fixup executes fixup commands for devices matched using dmi and \
hal properties.  This is primarily to adjust too aggressive ATA APM \
settings which makes the drive unload its head frequently shortening \
its lifespan."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "storage-fixup-0.2-50.9.noarch.rpm"
RPM_HASH = "131919b78fb1b826315fd5e93ab341b3b3faa9a76fa63698eab4831c60d61eeed7c169b92bbf5bfd6057427276b6e8e524c394b79014b3c5fe649014a3a3f4ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(storage-fixup) \
storage-fixup"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
bash \
coreutils \
dmidecode \
hdparm \
scsi \
sed \
smartmontools \
systemd"

inherit rpm

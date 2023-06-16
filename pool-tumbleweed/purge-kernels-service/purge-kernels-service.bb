SUMMARY = "The service for removing old kernels when multiversion is enabled"
DESCRIPTION = "This service runs zypper purge-kernels on boot after a kernel package was installed."
LICENSE = "MIT"

PV = "0"

RPM_NAME = "purge-kernels-service-0-9.4.noarch.rpm"
RPM_HASH = "4a7637316f7f3cff3a3a8b068b93c57a5b0698d0653109cd75602472a109cfbc5e45b93532a0b275be5653828258e17790a375eccad5b05f8cb8dd503cbf30ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracut-/usr/lib/systemd/system/purge-kernels.service \
purge-kernels-service"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper-purge-kernels"

inherit rpm

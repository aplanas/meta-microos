SUMMARY = "The service for removing old kernels when multiversion is enabled"
DESCRIPTION = "This service runs zypper purge-kernels on boot after a kernel package was installed."
LICENSE = "MIT"

PV = "0"

RPM_NAME = "purge-kernels-service-0-9.5.noarch.rpm"
RPM_HASH = "1d88e4a0737e0b9b68e707d90e21597b0265a51449c1bb2e4e7d5402b1b36f5678253606afac317542cd4c293576c9599d51feba5bece4f49edc60ba0cc889a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracut-/usr/lib/systemd/system/purge-kernels.service \
purge-kernels-service"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper-purge-kernels"

inherit rpm

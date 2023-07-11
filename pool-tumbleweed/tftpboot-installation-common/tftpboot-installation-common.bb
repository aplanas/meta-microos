SUMMARY = "Contains the needed services for tftpboot-installation"
DESCRIPTION = "This packages contains all the files and services which are needed to \
mount the tftpboot-installation images into the /srv/tftpboot directory."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "tftpboot-installation-common-1.1-1.12.noarch.rpm"
RPM_HASH = "374e3fe8bdb03bfc5ce4a7c69a6328a0b89eb8aadb4110c559ca7f5dd892573e4f9f73fb76f471b10439c1cd88b5687305e59ee4d144cca706326142542e7068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-common"

RDEPENDS:${PN} += "/usr/bin/sh \
tftp"

inherit rpm

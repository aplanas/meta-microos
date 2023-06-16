SUMMARY = "Contains the needed services for tftpboot-installation"
DESCRIPTION = "This packages contains all the files and services which are needed to \
mount the tftpboot-installation images into the /srv/tftpboot directory."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "tftpboot-installation-common-1.1-1.11.noarch.rpm"
RPM_HASH = "1747f815c3640504fa112d150d69f2b848cd3bddc7d7dd5b13b4b1c35efe02fe692f4dd3f0853a42043e5f50c6aa5f88036d2af04ad6262462ae2b8cd10a4a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tftpboot-installation-common"

RDEPENDS:${PN} += "/usr/bin/sh \
tftp"

inherit rpm

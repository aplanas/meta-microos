SUMMARY = "Dracut module for supporting transactional updates"
DESCRIPTION = "This package contains the dracut modules for handling early boot aspects \
for transactional updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "dracut-transactional-update-4.2.1-1.1.noarch.rpm"
RPM_HASH = "5f3bccf88dc78c5cadff6c5c7c2a8a1653983e9ab3ccb4609a6b49843550e18e5a751c6144c85984ad9f74ea4c74877c576299e8e21a3a54f067d0d55dbde076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracut-transactional-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
tukit"

inherit rpm

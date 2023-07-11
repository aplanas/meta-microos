SUMMARY = "Dracut module for supporting transactional updates"
DESCRIPTION = "This package contains the dracut modules for handling early boot aspects \
for transactional updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.0"

RPM_NAME = "dracut-transactional-update-4.3.0-1.1.noarch.rpm"
RPM_HASH = "f392b8f27bb147ca84bedd0c83467d7dc13b23843cc58eecc138d1537135cf2b572485ea97720d8b8ac13cfca2eebffdafe3cdd949c59524a453b163195fdffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracut-transactional-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
tukit"

inherit rpm

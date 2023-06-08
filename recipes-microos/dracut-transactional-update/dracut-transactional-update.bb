SUMMARY = "Dracut module for supporting transactional updates"
DESCRIPTION = "This package contains the dracut modules for handling early boot aspects \
for transactional updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.5"

RPM_NAME = "dracut-transactional-update-4.1.5-1.1.noarch.rpm"
RPM_HASH = "65c741716e5461f8bed5870ddd82e0a823d5f8f18b92fb191a8f1cb543d99174974d93420f6e6d818294f4cc7a9ad522883b441bbf6b5708845083b2b9fe9cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracut-transactional-update"
RDEPENDS:${PN} += "/bin/bash /bin/sh tukit"

inherit rpm

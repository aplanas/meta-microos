SUMMARY = "KIWI - Dracut module for vmx(+overlay) image type"
DESCRIPTION = "This package contains the kiwi-overlay dracut module which is used \
for booting vmx images built with KIWI and configured to use an \
overlay root filesystem"
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "dracut-kiwi-overlay-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "27528bc8f50090dc9a82d2eff1ad65097c88accc70f4a546be7ee63a321f252283a95529f5394d1e89f19aeaf3e208e8227aa0af947b56aafe1296a20789dc0e"

RPROVIDES:${PN} += "dracut-kiwi-overlay"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut \
dracut-kiwi-lib"

inherit rpm

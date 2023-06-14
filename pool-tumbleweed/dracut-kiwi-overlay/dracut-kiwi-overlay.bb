SUMMARY = "KIWI - Dracut module for vmx(+overlay) image type"
DESCRIPTION = "This package contains the kiwi-overlay dracut module which is used \
for booting vmx images built with KIWI and configured to use an \
overlay root filesystem"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "dracut-kiwi-overlay-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "b7b956bed048d5919119059e42598554ea86391d87377b3d978e6c15be8a6a82b909b583fdd750e243595d5012980a4f19640182f0a12fa21f2da9b7b2c472c0"

RPROVIDES:${PN} += "dracut-kiwi-overlay"

RDEPENDS:${PN} += "/bin/bash \
dracut \
dracut-kiwi-lib"

inherit rpm

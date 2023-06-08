SUMMARY = "KIWI - Dracut module for vmx(+overlay) image type"
DESCRIPTION = "This package contains the kiwi-overlay dracut module which is used \
for booting vmx images built with KIWI and configured to use an \
overlay root filesystem"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "dracut-kiwi-overlay-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "b51c871ea80741b8a6bb60a050f03c4e4aae10de0d61d31366076f4db4ce8597fa9dee377ed320991857f46cbc64f8c3c4a72beb7b523f0f6970cc3238f2375a"

RPROVIDES:${PN} += "dracut-kiwi-overlay dracut-kiwi-overlay(aarch-64)"
RDEPENDS:${PN} += "/bin/bash dracut dracut-kiwi-lib"

inherit rpm

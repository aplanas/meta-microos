SUMMARY = "LUKS integration for Clevis"
DESCRIPTION = "LUKS integration for Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-luks-19-2.1.aarch64.rpm"
RPM_HASH = "88a4095955f7a21ddc23d82a98a35f18e20540bb01caf3c8afcc67ba74d4e016d73c714c9c1154ead931bb8a09d33d38553f1b92c64a2cf638507ead98f53bd8"

RPROVIDES:${PN} += "clevis-luks \
clevis-luks(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
clevis \
cryptsetup \
libpwquality-tools"

inherit rpm

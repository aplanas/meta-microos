SUMMARY = "LUKS integration for Clevis"
DESCRIPTION = "LUKS integration for Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-luks-19-2.2.aarch64.rpm"
RPM_HASH = "2eeb9487679678c0b0111eb27610059b3709d99c2c6821e6c4169839d4d6589e72dbdb2a6f51718e47283c8ef22b66f7115d6e06b9a300e8866d73dcb9d6fbbd"

RPROVIDES:${PN} += "clevis-luks"

RDEPENDS:${PN} += "/usr/bin/bash \
clevis \
cryptsetup \
libpwquality-tools"

inherit rpm

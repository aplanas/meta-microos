SUMMARY = "Udev rules for Perseus SDR"
DESCRIPTION = "Udev rules for Perseus SDR hardware"
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "libperseus-sdr-udev-0.8.1-1.23.aarch64.rpm"
RPM_HASH = "cf2b373e83beb942a79dd74c59bbf3859d9e5c6b1de190e7da10f79882ac2df80584b5d29c34b9a0a3398c3f148dd5211cda97aad9466b0581e2095d080c432d"

RPROVIDES:${PN} += "libperseus-sdr-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
pwdutils"

inherit rpm

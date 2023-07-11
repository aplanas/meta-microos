SUMMARY = "Standalone Salt configuration to make the packaged formulas available for the Salt master"
DESCRIPTION = "This package adds the standalone configuration for the Salt master in order to make the packaged Salt formulas available on the Salt master"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-standalone-formulas-configuration-3006.0-1.4.aarch64.rpm"
RPM_HASH = "c05c2fb0d55e78d9e9f755c7bd9abd5a551d47784f0364b5415d7e8db91f8f63e550ed4d6cd32ce50a8aee42eef2ed44653e56b447bd09fc76c165032c80593f"

RPROVIDES:${PN} += "config-salt-standalone-formulas-configuration \
salt-formulas-configuration \
salt-standalone-formulas-configuration"

RDEPENDS:${PN} += "salt"

inherit rpm

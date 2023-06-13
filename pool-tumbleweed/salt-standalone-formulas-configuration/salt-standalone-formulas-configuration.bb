SUMMARY = "Standalone Salt configuration to make the packaged formulas available for the Salt master"
DESCRIPTION = "This package adds the standalone configuration for the Salt master in order to make the packaged Salt formulas available on the Salt master"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-standalone-formulas-configuration-3006.0-1.1.aarch64.rpm"
RPM_HASH = "e56dc7933b324140359d2056ae4310ba7c7a60ce77399395100f910d0bee20dc5091a88ea1ec47354141958ca982cf679d2d2b8799135221d5dd8246df3cf8eb"

RPROVIDES:${PN} += "config(salt-standalone-formulas-configuration) \
salt-formulas-configuration \
salt-standalone-formulas-configuration \
salt-standalone-formulas-configuration(aarch-64)"

RDEPENDS:${PN} += "salt"

inherit rpm

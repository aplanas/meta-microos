SUMMARY = "Standalone Salt configuration to make the packaged formulas available for the Salt master"
DESCRIPTION = "This package adds the standalone configuration for the Salt master in order to make the packaged Salt formulas available on the Salt master"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-standalone-formulas-configuration-3006.0-4.1.aarch64.rpm"
RPM_HASH = "a20a531cd4c71f46f9cd096e50845211b86a746814201add9951d2d1c5ce790790825964f39f7d0cbbac2b81d73805a8096ce109e10ffbb3fd58104d17f4cf91"

RPROVIDES:${PN} += "config-salt-standalone-formulas-configuration \
salt-formulas-configuration \
salt-standalone-formulas-configuration"

RDEPENDS:${PN} += "salt"

inherit rpm

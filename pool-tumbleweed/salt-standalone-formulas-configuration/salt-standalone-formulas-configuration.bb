SUMMARY = "Standalone Salt configuration to make the packaged formulas available for the Salt master"
DESCRIPTION = "This package adds the standalone configuration for the Salt master in order to make the packaged Salt formulas available on the Salt master"
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-standalone-formulas-configuration-3006.0-2.1.aarch64.rpm"
RPM_HASH = "708feae21d3e2943de92c0978ad9a690fc27c631c7aa69930128bfa7c3ee47be3670f0c81c04bfd8761e30c755efbf61f86ce7ca3b742f0ffc3f8515da14633a"

RPROVIDES:${PN} += "config-salt-standalone-formulas-configuration \
salt-formulas-configuration \
salt-standalone-formulas-configuration"

RDEPENDS:${PN} += "salt"

inherit rpm

SUMMARY = "DSSSL Engine (development package)"
DESCRIPTION = "Libraries and includes to compile applications that use the OpenJade \
framework (package 'openjade')."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "openjade-devel-1.3.2-373.8.aarch64.rpm"
RPM_HASH = "ff2cb249b54c25d2b179ea5684f63ee2cb0c87d0675c201f331624e979f291894f9a6c7e5634dde9159bf5a34e8b7633d07e9d67fec2078db37f0078e98b5b1f"

RPROVIDES:${PN} += "openjade-devel"

RDEPENDS:${PN} += "openjade"

inherit rpm

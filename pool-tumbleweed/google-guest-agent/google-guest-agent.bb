SUMMARY = "Google Cloud Guest Agent"
DESCRIPTION = "Google Cloud Guest Agent"
LICENSE = "Apache-2.0"

PV = "20230811.00"

RPM_NAME = "google-guest-agent-20230811.00-1.1.aarch64.rpm"
RPM_HASH = "d7e7a357f7d24efda87f7e9da995eb91270111fe6fa4606080aafb95030131f94519eb84d0ec8ac68268f9fa0e8acd0545be61c76945b2adb29836452a4e1e93"

RPROVIDES:${PN} += "google-compute-engine-init \
google-guest-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
google-guest-configs"

inherit rpm

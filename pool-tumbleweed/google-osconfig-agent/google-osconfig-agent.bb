SUMMARY = "Google Cloud Guest Agent"
DESCRIPTION = "Google Cloud OSConfig Agent"
LICENSE = "Apache-2.0"

PV = "20230706.02"

RPM_NAME = "google-osconfig-agent-20230706.02-1.1.aarch64.rpm"
RPM_HASH = "f4e6ace9d9e7c12171e7d03d0545f1be847c8dd33cbb03cc5d7405ce9018deb2c8e55d8b591cdb98c3b17a2db4c35106f4e908a8edeb0518100322d0683480a0"

RPROVIDES:${PN} += "google-osconfig-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
google-guest-configs"

inherit rpm

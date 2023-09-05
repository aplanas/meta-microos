SUMMARY = "Google Cloud Guest Agent"
DESCRIPTION = "Google Cloud OSConfig Agent"
LICENSE = "Apache-2.0"

PV = "20230829.00"

RPM_NAME = "google-osconfig-agent-20230829.00-1.1.aarch64.rpm"
RPM_HASH = "f342924b59fbb026b2d20ce85d37cb8151cf37e5ece7984304c01296c249572825c4a662f3771a74cb72e864b0e699e47b3376f4b62523418dc4a75479468776"

RPROVIDES:${PN} += "google-osconfig-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
google-guest-configs"

inherit rpm

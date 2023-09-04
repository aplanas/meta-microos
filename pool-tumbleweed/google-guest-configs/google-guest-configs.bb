SUMMARY = "Google Cloud Guest Configs"
DESCRIPTION = "Google Cloud Guest Configs"
LICENSE = "Apache-2.0"

PV = "20230808.00"

RPM_NAME = "google-guest-configs-20230808.00-2.1.noarch.rpm"
RPM_HASH = "2146b118196747d95c3993ef3f1c08e8c1cf4baaee4ec16d45997bd33e9152f68d3de2b8fd98199d273c37eb4b98fc68f4fb7e9d0cae81f9fc83f09de87e9175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-google-guest-configs \
google-guest-configs"

RDEPENDS:${PN} += "/usr/bin/bash \
nvme-cli"

inherit rpm

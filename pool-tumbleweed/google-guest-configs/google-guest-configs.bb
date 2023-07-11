SUMMARY = "Google Cloud Guest Configs"
DESCRIPTION = "Google Cloud Guest Configs"
LICENSE = "Apache-2.0"

PV = "20230626.00"

RPM_NAME = "google-guest-configs-20230626.00-1.1.noarch.rpm"
RPM_HASH = "e4ef18f427effa7c5da2afb17354d55ae09f34f95aed34304cd0a1e90ce200fc47fa2b3abab9682dd21c60c96e326f2f27a0bad641919d0abf74cb9c5e0d2b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-google-guest-configs \
google-guest-configs"

RDEPENDS:${PN} += "/usr/bin/bash \
nvme-cli"

inherit rpm

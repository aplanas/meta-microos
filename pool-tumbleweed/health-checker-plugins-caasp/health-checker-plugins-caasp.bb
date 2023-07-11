SUMMARY = "Health-checker plugins for SUSE CaaS Platform"
DESCRIPTION = "This package contains health-checker plugins for testing that \
the SUSE CaaS Platform did boot correctly."
LICENSE = "GPL-2.0-only"

PV = "1.9"

RPM_NAME = "health-checker-plugins-caasp-1.9-1.1.noarch.rpm"
RPM_HASH = "5c6588f4a9b88f441eb29886d6893d53fe074cd9bfe3fe2224c54a5873b5dabd5124581a38429694adf394c3720e24b3c74b8bace4ccb8772e8757d5ba78b103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins \
health-checker-plugins-caasp"

RDEPENDS:${PN} += "/usr/bin/bash \
health-checker"

inherit rpm

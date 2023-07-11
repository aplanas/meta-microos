SUMMARY = "Health-checker plugins for openSUSE MicroOS"
DESCRIPTION = "This package contains health-checker plugins for testing that \
the openSUSE MicroOS did boot correctly."
LICENSE = "GPL-2.0-only"

PV = "1.9"

RPM_NAME = "health-checker-plugins-MicroOS-1.9-1.1.noarch.rpm"
RPM_HASH = "1a70b7833c97747119ae41f2b077d54838938d216ba89e4e02cec58a751180f33d5c3495ad30437b59263e8fb1ea77d7b508106711c14254a8f60c621efd6edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins \
health-checker-plugins-MicroOS"

RDEPENDS:${PN} += "/usr/bin/bash \
health-checker"

inherit rpm

SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for easy_install. It uses mostly the same techniques for \
finding packages, so packages that were made easy_installable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "23.2.1"

RPM_NAME = "python310-pip-test-23.2.1-1.1.noarch.rpm"
RPM_HASH = "c1a2803624c3e54e746c6fed0a9d7e0e14ea560b96abd7fb3ae8f1592e63d6a6d3e066b3057c7cec84156a2fee17dca8def92309bbce5074d3c7c427cb90fcbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pip-test"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ca-certificates \
coreutils \
python310-setuptools \
python310-xml"

inherit rpm

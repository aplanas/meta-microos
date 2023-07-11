SUMMARY = "Comprehensive test and benchmarking platform"
DESCRIPTION = "The Phoronix Test Suite can be used for simply comparing your \
computer's performance or internal quality assurance purposes under \
Linux. Results from the Phoronix Test Suite are displayed in a results \
viewer with optional support for uploading them to PTS Global. This \
software is based upon the internal tools and extensive Linux \
benchmarking work done by Phoronix since 2004, with input from tier-one \
computer hardware vendors. The Phoronix Test Suite ships with over 50 \
tests and 20 suites."
LICENSE = "GPL-3.0-only"

PV = "10.8.4"

RPM_NAME = "phoronix-test-suite-10.8.4-3.3.noarch.rpm"
RPM_HASH = "4cf858a06796377eaa6252635e970117e2bf8001abaacc8aeb841b015c45d82d8c9cb0f6d14b72b919a37d409b2358cd990df24c1dac2e34985043766309f2b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-phoronix-test-suite \
phoronix-test-suite"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
php8 \
php8-curl \
php8-dom \
php8-gd \
php8-openssl \
php8-pcntl \
php8-posix \
php8-sockets \
php8-zip \
php8-zlib \
systemd \
xdg-utils"

inherit rpm

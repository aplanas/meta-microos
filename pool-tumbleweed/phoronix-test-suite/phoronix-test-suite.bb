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

RPM_NAME = "phoronix-test-suite-10.8.4-3.2.noarch.rpm"
RPM_HASH = "cc73416aa52693f3143755c559987fdf1c2df4a89f96b2c52be3460f40aaa99b17cad1a1aa84de3296e7fb554fbac160ae7924d3885b7afd9bee73f250879a95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(phoronix-test-suite-launcher.desktop) \
application(phoronix-test-suite.desktop) \
config(phoronix-test-suite) \
metainfo() \
metainfo(phoronix-test-suite.appdata.xml) \
mimehandler(application/x-openbenchmarking) \
phoronix-test-suite"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
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

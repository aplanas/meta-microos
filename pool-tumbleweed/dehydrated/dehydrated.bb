SUMMARY = "A client for signing certificates with an ACME server"
DESCRIPTION = "This is a client for signing certificates with an ACME server \
(currently only provided by letsencrypt) implemented as a relatively \
simple bash-script. \
 \
It uses the openssl utility for everything related to actually \
handling keys and certificates, so you need to have that installed. \
 \
Other dependencies are: curl, sed, grep, mktemp (all found on almost \
any system, curl being the only exception)."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "dehydrated-0.7.1-1.2.noarch.rpm"
RPM_HASH = "7d8c22f8c8d40bf1fb8662002f1ffe4fa80dec5543cedca8acf42a7641b22e1652ca89ac40d54c490e8befe4a4e716885545cef838d0c5d42648d1a2c8bf21b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dehydrated \
dehydrated \
letsencrypt.sh"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/getent \
/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
coreutils \
curl \
openssl \
sudo \
systemd"

inherit rpm

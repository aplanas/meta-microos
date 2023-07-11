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

RPM_NAME = "dehydrated-0.7.1-1.3.noarch.rpm"
RPM_HASH = "67b84c6d4a40e864b7ced410784bf4357dcc8fe54c395909b6272622656e20a9be2a7cdc4eeca775716cb243c003f2a58ebad4d7ff85e1e9970d23d5495cf08f"
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

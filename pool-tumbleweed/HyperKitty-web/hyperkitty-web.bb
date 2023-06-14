SUMMARY = "The webroot for GNU Mailman"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the web interface."
LICENSE = "GPL-3.0-only"

PV = "1.3.5"

RPM_NAME = "HyperKitty-web-1.3.5-7.1.noarch.rpm"
RPM_HASH = "d4e9c9c7bfb5855249adf7eb3bcdab9d28e920990c66b1a604f40f0037fe4f7ed51ccb7b371d62a0a4f17cb647caf486300fb80cfbfd64bce401aecf8ff79b67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HyperKitty-web \
config-HyperKitty-web"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3.9 \
HyperKitty \
acl \
openssl \
sudo"

inherit rpm

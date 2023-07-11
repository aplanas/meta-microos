SUMMARY = "The webroot for GNU Mailman"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the web interface."
LICENSE = "GPL-3.0-only"

PV = "1.3.7"

RPM_NAME = "HyperKitty-web-1.3.7-1.1.noarch.rpm"
RPM_HASH = "a7d2d1afdbed7ceb23b4f5710ca3c29270c71602a972a66ded344c3daa3d7039b3fb0498600df518f11ca4e69202b8fcb5fcf216d1070b962a83bbc3dbb73dd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HyperKitty-web \
config-HyperKitty-web"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.9 \
/usr/bin/sh \
HyperKitty \
acl \
openssl \
sudo"

inherit rpm

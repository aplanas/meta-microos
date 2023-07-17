SUMMARY = "The webroot for GNU Mailman"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the web interface."
LICENSE = "GPL-3.0-only"

PV = "1.3.7"

RPM_NAME = "HyperKitty-web-1.3.7-2.1.noarch.rpm"
RPM_HASH = "d760c5c030312b8f91b69bb3c1299895e4ea1da2dc909c43343c044f00b37ad5c1af9ab3db15115cb89d0ac4c9a3b32a021914b1748d08118fecfbfb3bbf6dfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "HyperKitty-web \
config-HyperKitty-web"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
/usr/bin/sh \
HyperKitty \
acl \
openssl \
sudo"

inherit rpm

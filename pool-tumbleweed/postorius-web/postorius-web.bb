SUMMARY = "The webroot for GNU Mailman"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the web interface."
LICENSE = "GPL-3.0-only"

PV = "1.3.7"

RPM_NAME = "postorius-web-1.3.7-1.3.noarch.rpm"
RPM_HASH = "732a9b3b4299dfeec6e3a0347a215233f44868c7e72690355ac27062851a13d5353913ae7ebf0bf0949884e60b29bed14593a75f692f10f3ee1e4dae316020f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(postorius-web) \
postorius-web"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3.9 \
acl \
openssl \
postorius \
sudo"

inherit rpm

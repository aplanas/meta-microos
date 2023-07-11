SUMMARY = "System user wwwrun and group www"
DESCRIPTION = "This package provides the system account 'wwwrun' and group 'www'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-wwwrun-20170617-24.16.noarch.rpm"
RPM_HASH = "c11843209ea0eaab6d6826fe1551a0542c0eff723c96ddfd00767822f1b25f6feef643e6456a321ee6d44456593a1fb46606fbc636d53c93ca463df740d37c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-www \
group-wwwrun \
system-user-wwwrun \
user-wwwrun"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

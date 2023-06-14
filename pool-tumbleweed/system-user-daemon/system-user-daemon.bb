SUMMARY = "System user and group 'daemon'"
DESCRIPTION = "This package provides the system account and group 'daemon' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-daemon-20170617-24.14.noarch.rpm"
RPM_HASH = "b03747eb39700414c2e0d67b2e37eab599e1bd101c8303dc6b41493801ca0583011e787bf40be192d1bc7d19d35893286fe39ee603e067e17350ca1c90eb598a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-daemon \
system-user-daemon \
user-daemon"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm

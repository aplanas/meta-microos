SUMMARY = "System user and group 'daemon'"
DESCRIPTION = "This package provides the system account and group 'daemon' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-daemon-20170617-24.16.noarch.rpm"
RPM_HASH = "10efa729ee0397bd8558670d7842a4c7b5c067354da1db6da3d3c3d980950303579f2cc65679bbb63f6fec697eca8a0d8884cb043d037c1077c774064da4e41d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-daemon \
system-user-daemon \
user-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

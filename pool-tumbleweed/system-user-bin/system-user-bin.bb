SUMMARY = "System user and group 'bin'"
DESCRIPTION = "This package provides the system account and group 'bin' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-bin-20170617-24.16.noarch.rpm"
RPM_HASH = "b94a50001036c01eacf0e5a6c9cc710efadfbc31e35f0622ab2f056fc9bee31628c3e77bf548d9129522b1bf9ecc7de8b33cf173801f3d57a57c90770c104279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-bin \
system-user-bin \
user-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow \
user-daemon"

inherit rpm

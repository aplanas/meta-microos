SUMMARY = "System user and group 'man'"
DESCRIPTION = "This package provides the system account and group 'man' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-man-20170617-24.16.noarch.rpm"
RPM_HASH = "8ef9d5c5ff813f0f12f0aace587898bf95b9c1b88233c33da8e7cf35aab022d0d1ab085c8ce7d571f4178b21500659ddf01e9f6b915fad3e793d467d7e2c81ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-man \
system-user-man \
user-man"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

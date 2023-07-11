SUMMARY = "System user and group uuidd"
DESCRIPTION = "This package provides the system account and group 'uuidd'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-uuidd-20170617-24.16.noarch.rpm"
RPM_HASH = "0f92c577d3ca56c92362382827b517bbb3c9477b5784c4a92ee1cd93e1243179559e0b7dbf0b9e47e44454e3b8f8c8632e47e1bf11e7044a3ceb9a9e634f19ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-uuidd \
system-user-uuidd \
user-uuidd"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

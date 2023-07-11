SUMMARY = "System user and group tss"
DESCRIPTION = "This package provides the system account and group 'tss'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-tss-20170617-24.16.noarch.rpm"
RPM_HASH = "6be45ec1693623e93d09a7b2ca47f127641757cab2b6ee4a0ce49a64cb0f165753163674b014a9ad22bc3dfcff05da2669d14e6591df950eee3c43adacff2e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-tss \
system-user-tss \
user-tss"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

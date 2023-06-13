SUMMARY = "System user and group 'bin'"
DESCRIPTION = "This package provides the system account and group 'bin' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-bin-20170617-24.14.noarch.rpm"
RPM_HASH = "602de7730d391aa50f26ce9b58759322109e12de1cd7deb4506b3bb9beafb4501755b52bf9cdc0b308efbbf73e63ed4ef451f403f6fe6f342f450fc89ec637e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(bin) \
system-user-bin \
user(bin)"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow \
user(daemon)"

inherit rpm

SUMMARY = "Shared directories between PowerDNS Packages"
DESCRIPTION = "Shared directories between PowerDNS Packages"
LICENSE = "MIT"

PV = "4.0"

RPM_NAME = "pdns-common-4.0-3.3.noarch.rpm"
RPM_HASH = "7999b0992d4c2f077b7bf4e45c445debc70d232c9466ab14e9f9d43b65fef0ea6db9094a0ad3792671dbd0d1ede6e7c9d007ebe213987197b41f32cb09032a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-pdns \
pdns-common \
user-pdns"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow \
sysuser-shadow"

inherit rpm

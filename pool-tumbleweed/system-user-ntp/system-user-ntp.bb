SUMMARY = "System user ntp and group"
DESCRIPTION = "This package provides the system user and group 'ntp'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-ntp-20170617-24.14.noarch.rpm"
RPM_HASH = "e01a2310edae9ea855f927aed9cd9629e2e87b1d0624c2cbb9af97725a12b265d9d8bed8e7a8f8b2b4185b45b183ef5a47f1e566e67cdfc0b231865752b350b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-ntp \
system-user-ntp \
user-ntp"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm

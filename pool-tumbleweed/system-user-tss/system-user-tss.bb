SUMMARY = "System user and group tss"
DESCRIPTION = "This package provides the system account and group 'tss'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-tss-20170617-24.14.noarch.rpm"
RPM_HASH = "a4c0e31ec9dabf1dbf24bc00dab165e1dbf3b8b9e77989f884e6485251201232341ca2c6251c0162ab69ea4bc6220ec31cdcea12fec5d4e2507be67eafb2b7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-tss \
system-user-tss \
user-tss"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm

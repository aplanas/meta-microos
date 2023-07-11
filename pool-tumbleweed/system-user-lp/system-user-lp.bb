SUMMARY = "System user lp"
DESCRIPTION = "This package provides the system account and group 'lp'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-lp-20170617-24.16.noarch.rpm"
RPM_HASH = "2fc0dd186f76ef8dbf8dec9653243ba94ad44b3341a041a16f3982ac183f5a754fa9c80b0a0338ece4a7a46c1671f60601767b6a4d06dfcb38ce0550aeffe916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-lp \
system-user-lp \
user-lp"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

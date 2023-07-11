SUMMARY = "System user and group mail"
DESCRIPTION = "This package provides the system account and group 'mail'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-mail-20170617-24.16.noarch.rpm"
RPM_HASH = "4644db14e341e147bf40ef6159b44da0affc1c5c270fae71532aa34935f86f37b309231b05232c12472193dd6cd3dc35efa7fde17e32c66f9306b5d3b1826824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-mail \
system-user-mail \
user-mail"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

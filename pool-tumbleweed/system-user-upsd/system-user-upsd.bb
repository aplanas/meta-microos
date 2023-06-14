SUMMARY = "System user upsd"
DESCRIPTION = "This package provides the system account 'upsd'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-upsd-20170617-24.14.noarch.rpm"
RPM_HASH = "ccad49b71c57809a541d76aff5785cdd4727fa441059c6443fc93e93f7652468dd650a132dfbe9dd91868c32e4a417362e179154414c0d076341c456d056311a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-upsd \
system-user-upsd \
user-upsd"

RDEPENDS:${PN} += "/bin/sh \
group-daemon \
sysuser-shadow"

inherit rpm

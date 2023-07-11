SUMMARY = "System user and group tftp"
DESCRIPTION = "This package provides the system account and group 'tftp'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-tftp-20170617-24.16.noarch.rpm"
RPM_HASH = "ede6aa016d70da05f466a0690d1e7d91ed915fc4a5248faa449aab715302d2dca754550ae36097904211f877d447be84b34273f787144c0601594f9b3a570aac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-tftp \
system-user-tftp \
user-tftp"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

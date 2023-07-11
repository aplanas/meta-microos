SUMMARY = "System user upsd"
DESCRIPTION = "This package provides the system account 'upsd'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-upsd-20170617-24.16.noarch.rpm"
RPM_HASH = "2009f117920a316c0f3c508ec553c919ecae510eca36383c2d5bac54fd57d7b8295230785d50150369b90b6a6180d4e640903eb148d89ac55ecf2bb77754ba43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-upsd \
system-user-upsd \
user-upsd"

RDEPENDS:${PN} += "/usr/bin/sh \
group-daemon \
sysuser-shadow"

inherit rpm

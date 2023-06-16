SUMMARY = "System group 'wheel'"
DESCRIPTION = "This package provides the system group 'wheel'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-group-wheel-20170617-24.14.noarch.rpm"
RPM_HASH = "96933bd208ecedcbe023ac6c41dc6cac5a4e4728695cdd806dfad57f014fdff228b26a973e704208fff86d06f98eeaa87791173103d1b7ab3c768863fb16a41c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-wheel \
system-group-wheel"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

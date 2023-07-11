SUMMARY = "Obsolete system groups"
DESCRIPTION = "This package provides some obsolete system groups."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-group-obsolete-20170617-24.16.noarch.rpm"
RPM_HASH = "05b441f8aebdf5b97ad74dc60abc67e3d2ee611579cde1f40f9ec95bbd49d0a76164bb66e415e419b6d7aee2d9e8299bfb47938500f16e9ab09bfeddaa5c95a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-console \
group-floppy \
group-modem \
group-public \
group-sys \
group-xok \
system-group-obsolete"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

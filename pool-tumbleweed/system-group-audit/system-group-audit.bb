SUMMARY = "System group 'audit'"
DESCRIPTION = "This package contains the system group 'audit' for read access to logs."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.9"

RPM_NAME = "system-group-audit-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "c0c4a0b055198949c933c045ce404de6db5a761e8e8e9de27916c73ee0c004129a8e9927d7f55268022d2c6cf3481a4a612a553e9d075e2f367e36b3f82f9772"

RPROVIDES:${PN} += "group-audit \
system-group-audit"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm

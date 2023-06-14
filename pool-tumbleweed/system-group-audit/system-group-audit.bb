SUMMARY = "System group 'audit'"
DESCRIPTION = "This package contains the system group 'audit' for read access to logs."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.9"

RPM_NAME = "system-group-audit-3.0.9-1.3.aarch64.rpm"
RPM_HASH = "7b136f40f0e4fe8b58ef4a217a637fc5a49bc5f6c53e463b9443d7d0407ed572c46675c5bdcf0cc39b4e6e15eb1935ccba95779d463e6789a2f9d09054d91061"

RPROVIDES:${PN} += "group-audit \
system-group-audit"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm

SUMMARY = "Common Icinga 2 configuration"
DESCRIPTION = "This subpackage provides common directories, and the UID and GUID definitions \
among Icinga 2 related packages."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "icinga2-common-2.13.8-2.1.aarch64.rpm"
RPM_HASH = "2fe5c739ea903c242dfc54c3e0462edce0a89d18e37353710db4faf181bdcf89f196a6f9d7ff03a22bc68b4330238fef0fbabd97aeb7029122ef31e5c5d40778"

RPROVIDES:${PN} += "group-icinga \
group-icingacmd \
icinga2-common \
user-icinga"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
monitoring-plugins-common \
permissions \
shadow"

inherit rpm

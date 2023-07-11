SUMMARY = "Common Icinga 2 configuration"
DESCRIPTION = "This subpackage provides common directories, and the UID and GUID definitions \
among Icinga 2 related packages."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-common-2.13.7-1.5.aarch64.rpm"
RPM_HASH = "d441885cc5c784c605c045db97949546fda3b6a551ee735538ef68083b0607891c7b4ffb4fdb1d5647222b83674478094e9778abd49344bb199552a9d1374be9"

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

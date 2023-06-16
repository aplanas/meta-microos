SUMMARY = "Common Icinga 2 configuration"
DESCRIPTION = "This subpackage provides common directories, and the UID and GUID definitions \
among Icinga 2 related packages."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.7"

RPM_NAME = "icinga2-common-2.13.7-1.4.aarch64.rpm"
RPM_HASH = "753e4d783f913b9b82e836a75e2c373965527c533863ba2df1d7a79242c513d4cfff7e45d9b8d785ac420e8910179769f9c8c76b16a620d9e88ec8f50591a852"

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

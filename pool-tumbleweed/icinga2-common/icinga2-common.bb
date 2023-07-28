SUMMARY = "Common Icinga 2 configuration"
DESCRIPTION = "This subpackage provides common directories, and the UID and GUID definitions \
among Icinga 2 related packages."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "icinga2-common-2.13.8-1.1.aarch64.rpm"
RPM_HASH = "0a8cabb21873f81cdc4b8acc1e2d2894df7158905724194b589f911565155d3a9b00157fe9cfe6c1b064a2aca2dfb0dd73d5326790d4b666adc751896302a8eb"

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

SUMMARY = "Chrony preconfiguration for openSUSE"
DESCRIPTION = "This package configures chrony to use the openSUSE NTP server pool by \
default."
LICENSE = "GPL-2.0-only"

PV = "4.4"

RPM_NAME = "chrony-pool-openSUSE-4.4-1.1.noarch.rpm"
RPM_HASH = "8df8676ba5db2ae0e57334c205530f7bc16a22893c0b3dc976fd43c4b061e6d05eeee49af6769a5fac969bfc074c8424a8a0a33eed05513a1e4d109562767b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chrony-pool \
chrony-pool-nonempty \
chrony-pool-openSUSE \
config-chrony-pool-openSUSE"

RDEPENDS:${PN} += "chrony"

inherit rpm

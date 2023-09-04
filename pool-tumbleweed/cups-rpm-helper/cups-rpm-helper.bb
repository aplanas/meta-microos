SUMMARY = "RPM macros for building cups drivers"
DESCRIPTION = "RPM helper scripts to create automatic 'Provides:' tags for printer \
driver RPMs."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "cups-rpm-helper-2.0.1-3.1.aarch64.rpm"
RPM_HASH = "2a8b03cfbc938da626b7642cc68c0659e6089b095031b776557c89d92e5eafc5a34299df99826fec627ed8c48ca7b19b232feeddbd2ad243621bb0ca84d644e0"

RPROVIDES:${PN} += "cups-rpm-helper"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-cups \
rpm-build"

inherit rpm

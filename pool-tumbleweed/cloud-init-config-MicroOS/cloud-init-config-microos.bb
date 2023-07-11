SUMMARY = "openSUSE MicroOS configuration file for could-init"
DESCRIPTION = "This package contains the openSUSE MicroOS specific \
configuration file for cloud-init."
LICENSE = "GPL-3.0-only"

PV = "1.1"

RPM_NAME = "cloud-init-config-MicroOS-1.1-3.1.noarch.rpm"
RPM_HASH = "cca3c38706b5f87e173edfd0a84e4b9676cabe23d6757ef3fb10dcac34da5bc81bfaa2403b8140376f29263b5a8f840b2674aae180e35f0c85cb725de27b174e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-init-config \
cloud-init-config-MicroOS \
config-cloud-init-config-MicroOS"

RDEPENDS:${PN} += "cloud-init"

inherit rpm

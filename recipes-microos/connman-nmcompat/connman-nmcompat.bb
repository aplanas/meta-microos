SUMMARY = "NetworkManager compatibility for connman"
DESCRIPTION = "Provides NetworkManager compatibility for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-nmcompat-1.41-4.7.aarch64.rpm"
RPM_HASH = "0a60536a0cc8cbb2801f07ec5dbcf9a1492911bfc20381d3d27bf7fe1bfbdc391f85f465771f87687b779640ba5a0e72ee4ae0d77b4176070b9a8f462a64cb0c"

RPROVIDES:${PN} += "connman-nmcompat \
connman-nmcompat(aarch-64)"
RDEPENDS:${PN} += "connman"

inherit rpm

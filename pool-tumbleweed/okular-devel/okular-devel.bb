SUMMARY = "Development files for the Okular document viewer"
DESCRIPTION = "Document viewing program; supports document in various formats"
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "okular-devel-23.04.1-1.2.aarch64.rpm"
RPM_HASH = "83287ab621f1baaeca147958cfe2e70dc56383a27f9a7f708476a442ecd9a37cf1ffd3d3f5846bd2c14bd0614c285d9eff2ccafc8abbdd0703f06fc50e68964f"

RPROVIDES:${PN} += "cmake(Okular5) \
okular-devel \
okular-devel(aarch-64) \
okular5-devel"

RDEPENDS:${PN} += "cmake(KF5Config) \
cmake(KF5CoreAddons) \
cmake(KF5XmlGui) \
cmake(Qt5Core) \
cmake(Qt5PrintSupport) \
cmake(Qt5Widgets) \
libQt5Core-private-headers-devel \
okular"

inherit rpm

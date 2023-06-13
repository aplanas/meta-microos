SUMMARY = "Application for updating Flipper Zero firmware - udev rules"
DESCRIPTION = "Application for updating Flipper Zero firmware - udev rules"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1~rc1+git1.1684488882.0199220"

RPM_NAME = "qFlipper-base-1.3.1~rc1+git1.1684488882.0199220-1.1.noarch.rpm"
RPM_HASH = "296a68af426f9dd1af010954d1e9deb79eec0d2f194c3ec62dc9a948538a272b93c6347b9c116dbab195d56cf42c126f330756551f72b631dc38478d1acca013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qFlipper-base"

RDEPENDS:${PN} += ""

inherit rpm

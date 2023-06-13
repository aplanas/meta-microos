SUMMARY = "Fetch location and size of physical screens"
DESCRIPTION = "Python module to fetch location and size of physical screens."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python311-screeninfo-0.8.1-1.3.noarch.rpm"
RPM_HASH = "f17e9cbb5fe5ca3fac7e08f32f83c8774b1a1af1c5bfff0e1dabbc2d0fbb17dd36c50ab608d7c49097fd02dc6adb789960d2dfbc94c8253eca8949eb047675a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(screeninfo) \
python311-screeninfo \
python3dist(screeninfo)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm

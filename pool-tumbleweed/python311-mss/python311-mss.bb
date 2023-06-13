SUMMARY = "Python multiple screenshots module"
DESCRIPTION = "An ultra fast cross-platform multiple screenshots module in pure Python using ctypes."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python311-mss-7.0.1-1.4.noarch.rpm"
RPM_HASH = "ae378fe1e18c3867466cef230ae2cd560131c2fed041aee781f622904dca86e7adf674b80b9105f65330d56f665bc4522833c378b1c35c2612ae5d9186005260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mss) \
python311-mss \
python3dist(mss)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives \
xrandr"

inherit rpm

SUMMARY = "Automate generation of man pages for python click applications"
DESCRIPTION = "Automate generation of man pages for Python Click applications."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-click-man-0.4.1-1.15.noarch.rpm"
RPM_HASH = "9777213ce96fbc9495dcda0c30a3cbbdd239eb816d8ba224e2c9011260d7ad3e218e3230356f1d4d875d927a1118808fbf29faf0ee9af743c43ae11f99c2f651"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-man \
python3.10dist-click-man \
python310-click-man \
python3dist-click-man"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click"

inherit rpm

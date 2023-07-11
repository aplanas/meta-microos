SUMMARY = "Query and change XKB layout state"
DESCRIPTION = "Python library to query and change XKB layout state."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-xkbgroup-0.2.0-3.13.noarch.rpm"
RPM_HASH = "116e53e613ca1fec52b068039a766f55768103e1b73661e7a53b075ddd87f796afa6432da42302d1007c21d8c380fec2d6bbd9ccc8302b182ab9759a8055c53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xkbgroup \
python310-xkbgroup \
python3dist-xkbgroup"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives \
xorg-x11-server"

inherit rpm

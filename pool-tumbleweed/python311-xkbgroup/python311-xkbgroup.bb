SUMMARY = "Query and change XKB layout state"
DESCRIPTION = "Python library to query and change XKB layout state."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-xkbgroup-0.2.0-3.13.noarch.rpm"
RPM_HASH = "ba470316b4559b5d7f3f8ed3c9798050985f50aa502f6bdd031a0ca3060ce65e8d49c2a88be36d14cb59dfa780d3131c02ccc622cc1f868b24ef0daec1a134b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xkbgroup \
python3.11dist-xkbgroup \
python311-xkbgroup \
python3dist-xkbgroup"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives \
xorg-x11-server"

inherit rpm

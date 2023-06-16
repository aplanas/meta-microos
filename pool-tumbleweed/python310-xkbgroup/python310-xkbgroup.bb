SUMMARY = "Query and change XKB layout state"
DESCRIPTION = "Python library to query and change XKB layout state."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-xkbgroup-0.2.0-3.12.noarch.rpm"
RPM_HASH = "bca882357eda3296bc1699b859ad7ff5800174f52056add04ebe3bd2cd56c14cf55aa038590b65a81bf970d2f0ff4a49b3ba9081c19729362dabd224aba28239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xkbgroup \
python3.10dist-xkbgroup \
python310-xkbgroup \
python3dist-xkbgroup"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives \
xorg-x11-server"

inherit rpm

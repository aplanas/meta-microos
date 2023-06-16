SUMMARY = "Query and change XKB layout state"
DESCRIPTION = "Python library to query and change XKB layout state."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-xkbgroup-0.2.0-3.12.noarch.rpm"
RPM_HASH = "1e6dc3abd9c3db5f4ed460215358ef7033ba49ac76618faa899e548977e8626cb8ab911da71a32f64165d2a7dd830304dea080398f830252227cf163aeec475f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xkbgroup \
python39-xkbgroup \
python3dist-xkbgroup"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives \
xorg-x11-server"

inherit rpm

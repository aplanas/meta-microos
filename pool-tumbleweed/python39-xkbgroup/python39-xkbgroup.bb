SUMMARY = "Query and change XKB layout state"
DESCRIPTION = "Python library to query and change XKB layout state."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-xkbgroup-0.2.0-3.13.noarch.rpm"
RPM_HASH = "4726017f7cb9b1decf21b1235847f74119bc7349fdf527a9d709b53f57e425d769a83bfd516b251050d8aea00dc03948ab9b3dcd99287e01f87eec197b86d7b1"
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

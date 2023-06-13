SUMMARY = "Query and change XKB layout state"
DESCRIPTION = "Python library to query and change XKB layout state."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python311-xkbgroup-0.2.0-3.12.noarch.rpm"
RPM_HASH = "e45b6335e383f5c1c366dfbe24879a321e87335a056e9b08e555cae1112f97fde22bafeaa6c9e975a8d21fdf3eb227fcfa62133bfef42eaa3a419d4d594634cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xkbgroup) \
python311-xkbgroup \
python3dist(xkbgroup)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives \
xorg-x11-server"

inherit rpm

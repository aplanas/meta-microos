SUMMARY = "Python nautilus files shared between python interpreter versions"
DESCRIPTION = "This package contains common files required to build wrappers for \
python-nautilus in both Python2 and Python3."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python-nautilus-common-files-4.0-2.1.aarch64.rpm"
RPM_HASH = "99e7ab23260dde2cbac0aeeec1171e038964d6d28f22af356863f498f4fd9e82593a47efad45eca66ea8cdd73be55f74e32f5266d247b19dd0aadcbf3c3a505c"

RPROVIDES:${PN} += "libnautilus-python.so \
python-nautilus-common-files \
python310-nautilus-common-files \
python311-nautilus-common-files \
python39-nautilus-common-files"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnautilus-extension.so.4 \
libpython3.11.so.1.0"

inherit rpm

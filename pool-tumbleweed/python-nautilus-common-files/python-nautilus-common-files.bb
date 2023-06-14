SUMMARY = "Python nautilus files shared between python interpreter versions"
DESCRIPTION = "This package contains common files required to build wrappers for \
python-nautilus in both Python2 and Python3."
LICENSE = "GPL-2.0-or-later"

PV = "4.0"

RPM_NAME = "python-nautilus-common-files-4.0-1.5.aarch64.rpm"
RPM_HASH = "64a04b358ed13869c1b153feec4441a15e1be445a4328c2efc65a54affa5e52307af78649117bf8868fd4b349dc00e32f895f14b241d4169992fc0221f650e22"

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
libpython3.10.so.1.0"

inherit rpm

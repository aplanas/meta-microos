SUMMARY = "Python bindings for the Nemo File manager"
DESCRIPTION = " \
 \
 \
 \
 \
Includes Python bindings for the Nemo Filemanager."
LICENSE = "GPL-2.0-only"

PV = "5.2.0"

RPM_NAME = "python3-nemo-5.2.0-3.4.aarch64.rpm"
RPM_HASH = "5401e370424def6bcb5452b4cec1e5e1c331a6a87b4bbd70a41253ac60bf4df258ff51139c5e70bd766f98899f2174620c6903ff7a319bb7fe59e7b1811fe3d1"

RPROVIDES:${PN} += "libnemo-python.so \
nemo-python \
pkgconfig-nemo-python \
python-nemo \
python2-nemo \
python3-nemo \
python3-nemo-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
libpython3.10.so.1.0 \
nemo"

inherit rpm

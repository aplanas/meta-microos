SUMMARY = "Python bindings for the Nemo File manager"
DESCRIPTION = " \
 \
 \
 \
 \
Includes Python bindings for the Nemo Filemanager."
LICENSE = "GPL-2.0-only"

PV = "5.2.0"

RPM_NAME = "python3-nemo-5.2.0-3.6.aarch64.rpm"
RPM_HASH = "0b823d9e2b4f532e5aa4944cc654d2090ba35935edf1234c04201e14d5d838e6909b740e812cb918d4ee67aa5ca97b2052f1b0d249a9574b8da9a7ba3a6b7bb5"

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
libpython3.11.so.1.0 \
nemo"

inherit rpm

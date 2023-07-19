SUMMARY = "Python bindings for the Nemo File manager"
DESCRIPTION = " \
 \
 \
 \
 \
Includes Python bindings for the Nemo Filemanager."
LICENSE = "GPL-2.0-only"

PV = "5.2.0"

RPM_NAME = "python3-nemo-5.2.0-4.1.aarch64.rpm"
RPM_HASH = "341d0ff7eb352a3c4bdf1ad810725cb8a20d37a02c0da7a5c1870f6b992700deca431c0e1f783fb9d47ed67d4eb81f0d202b44698acd290ad4561de431e18f30"

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

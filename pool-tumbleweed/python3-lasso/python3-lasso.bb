SUMMARY = "Liberty Alliance Single Sign On (lasso) Python bindings"
DESCRIPTION = "Python language bindings for the lasso (Liberty Alliance Single Sign On) \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.2"

RPM_NAME = "python3-lasso-2.8.2-1.4.aarch64.rpm"
RPM_HASH = "0c18fe4d75a4771ea0c1e22c83984af9a597eec18b34ed808e6febe342b7bc1ab647053b2e4683228f1f49ec54733b660dbc1d84f3eecec854a256c56822ee98"

RPROVIDES:${PN} += "python3-lasso"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblasso.so.3 \
liblasso3 \
libxml2.so.2 \
python-abi \
python3"

inherit rpm

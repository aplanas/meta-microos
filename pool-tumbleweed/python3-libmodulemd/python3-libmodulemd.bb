SUMMARY = "Python 3 bindings for libmodulemd"
DESCRIPTION = "This package provides the Python 3 bindings for libmodulemd."
LICENSE = "MIT"

PV = "2.14.0"

RPM_NAME = "python3-libmodulemd-2.14.0-1.3.aarch64.rpm"
RPM_HASH = "e60d39b1ff36f1483607efcd835a61d53e887efc812f831f57455c487b9e0c511ed5b4071db173a607030ea9ad7492a4c92e20985e2d73e7909e727d90b01949"

RPROVIDES:${PN} += "python3-libmodulemd"

RDEPENDS:${PN} += "python-abi \
python3-gobject \
python3-six \
typelib-1-0-Modulemd-2-0 \
typelib-GLib \
typelib-Modulemd"

inherit rpm

SUMMARY = "Python 3 bindings for libmodulemd"
DESCRIPTION = "This package provides the Python 3 bindings for libmodulemd."
LICENSE = "MIT"

PV = "2.14.0"

RPM_NAME = "python3-libmodulemd-2.14.0-1.4.aarch64.rpm"
RPM_HASH = "71f52ff0610168740ca1a45e1ad5cab6e57ebd825de801289c5b3f5c1492f0e44f0be7a347a12bf1ac03394a54d8f62c64c3812e37bc79bc36d07efc2fee37c2"

RPROVIDES:${PN} += "python3-libmodulemd"

RDEPENDS:${PN} += "python-abi \
python3-gobject \
python3-six \
typelib-1-0-Modulemd-2-0 \
typelib-GLib \
typelib-Modulemd"

inherit rpm

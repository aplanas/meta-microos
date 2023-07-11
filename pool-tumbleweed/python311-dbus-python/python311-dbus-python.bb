SUMMARY = "Python bindings for D-Bus"
DESCRIPTION = "D-Bus python bindings for use with python programs."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python311-dbus-python-1.3.2-2.2.aarch64.rpm"
RPM_HASH = "76d889a8b75356c3b4719b2219662ac89eddff5a822acc6374841cc0bfee8ad616781459cb775d5a5bdcda8bdd7eac081209f95598d50d60dc283aba1b83dff1"

RPROVIDES:${PN} += "dbus-1-python3 \
dbus-1-python311 \
python3-dbus-python \
python311-dbus-python"

RDEPENDS:${PN} += "dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
python-abi \
python311-gobject \
python311-xml"

inherit rpm

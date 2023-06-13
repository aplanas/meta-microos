SUMMARY = "Python binding to the wayland library using cffi"
DESCRIPTION = "Python binding to the wayland library using cffi."
LICENSE = "NCSA"

PV = "0.4.15"

RPM_NAME = "python311-pywayland-0.4.15-1.4.aarch64.rpm"
RPM_HASH = "dc0af213c50d78f4987dd3873dced15dabc67680956e55a0daf746f9fb60933f188ef85b5171f30dc42a293f29a83a282d715ab19b5ee1b9c330e7218cd48a10"

RPROVIDES:${PN} += "python3.11dist(pywayland) \
python311-pywayland \
python311-pywayland(aarch-64) \
python3dist(pywayland)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
python(abi) \
update-alternatives"

inherit rpm

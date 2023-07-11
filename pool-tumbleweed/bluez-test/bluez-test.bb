SUMMARY = "Tools for testing of various Bluetooth-functions"
DESCRIPTION = "Contains a few tools for testing various bluetooth functions. The \
BLUETOOTH trademarks are owned by Bluetooth SIG, Inc., U.S.A."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.66"

RPM_NAME = "bluez-test-5.66-1.8.aarch64.rpm"
RPM_HASH = "dd4c514822ae1b41b75922f6ceebeaf16bd09f49cf2d44371578cf441cbd80062e1d382732ed8b503a425b7857e0524f29ef7febcfb144964373bff279836c3f"

RPROVIDES:${PN} += "bluez-test"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
python3-dbus-python \
python3-gobject"

inherit rpm

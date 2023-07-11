SUMMARY = "Python bindings for the Assistive Technology Service Provider Interface"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
This package contains the python bindings for AT-SPI."
LICENSE = "LGPL-2.0-only"

PV = "2.46.0"

RPM_NAME = "python310-atspi-2.46.0-1.4.noarch.rpm"
RPM_HASH = "9837ac9ab2b3bddc7db6dbaed87c717c1b73b89f01e27729cd669e06f3c6c9cc18745c4fcd3adb6a61be3638686fb3385a86fc0c8268eae3ed50d9284f8337a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-atspi"

RDEPENDS:${PN} += "python-abi \
python310-dbus-python \
python310-gobject \
typelib-Atspi \
typelib-GLib \
typelib-GObject"

inherit rpm

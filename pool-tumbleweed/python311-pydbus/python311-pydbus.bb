SUMMARY = "Pythonic DBus library"
DESCRIPTION = "A dbus library for Python."
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "python311-pydbus-0.6.0-1.18.noarch.rpm"
RPM_HASH = "19fff811eee53f8e20812610f2a728ea3ca5bf5aec819939f54eea7eb45a2e94f7e16d56ac29d0a5cafc59259f4e5de17e7b32450aacf16c9e75a5768bf5f9bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydbus \
python3.11dist-pydbus \
python311-pydbus \
python3dist-pydbus"

RDEPENDS:${PN} += "girepository-1-0 \
python-abi \
python311-gobject"

inherit rpm

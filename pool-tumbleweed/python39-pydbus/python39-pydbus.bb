SUMMARY = "Pythonic DBus library"
DESCRIPTION = "A dbus library for Python."
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "python39-pydbus-0.6.0-1.18.noarch.rpm"
RPM_HASH = "1be59d8e69603a5b3ee5a48c3c434e0e094813f5ec9c12174d00b7f004f7d69cdf60d70d7504352de7208130f889d1911ace78256ceeba7f9852cfe112563bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydbus \
python39-pydbus \
python3dist-pydbus"

RDEPENDS:${PN} += "girepository-1-0 \
python-abi \
python39-gobject"

inherit rpm

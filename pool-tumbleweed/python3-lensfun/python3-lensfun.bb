SUMMARY = "Python3 lensfun bindings"
DESCRIPTION = "Lensfun bindings for Python 3"
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "python3-lensfun-0.3.3-1.8.aarch64.rpm"
RPM_HASH = "c562068606b16a5647b0731f47fd07bdf3084a3b5548ba3663efab9190ea1daf61f42fd88b1f2ed2206c1c7f4e3588e495edec7f1b89570f6847d32b5b0938b4"

RPROVIDES:${PN} += "python3-lensfun \
python3.11dist-lensfun \
python3dist-lensfun"

RDEPENDS:${PN} += "liblensfun1 \
python-abi"

inherit rpm

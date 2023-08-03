SUMMARY = "Python3 lensfun bindings"
DESCRIPTION = "Lensfun bindings for Python 3"
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.4"

RPM_NAME = "python3-lensfun-0.3.4-1.1.aarch64.rpm"
RPM_HASH = "15ded9f905f9e701deea22a3d2c0f9718e4f4bf36d6af0c5c5e2af8f006907659a74e9fc37e8d9365b3c4c95f60906dfad652e0a0c3c7f34b537b4ea1fd46a6d"

RPROVIDES:${PN} += "python3-lensfun \
python3.11dist-lensfun \
python3dist-lensfun"

RDEPENDS:${PN} += "liblensfun1 \
python-abi"

inherit rpm

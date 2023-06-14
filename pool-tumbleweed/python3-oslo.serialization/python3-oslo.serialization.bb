SUMMARY = "OpenStack serialization library"
DESCRIPTION = "The oslo.serialization library provides support for representing objects \
in transmittable and storable formats, such as Base64, JSON and MessagePack. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python3-oslo.serialization-5.0.0-1.3.noarch.rpm"
RPM_HASH = "00d59101613a95bfcaa97f0e7965c8717983af1f69778f330ea832bc50b985ac693035dc935a791782e341c65bdee34429dd03d531d6aca53ea051810403a042"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.serialization \
python3.10dist-oslo.serialization \
python3dist-oslo.serialization"

RDEPENDS:${PN} += "python-abi \
python3-msgpack \
python3-oslo.utils \
python3-pytz"

inherit rpm

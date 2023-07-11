SUMMARY = "OpenStack serialization library"
DESCRIPTION = "The oslo.serialization library provides support for representing objects \
in transmittable and storable formats, such as Base64, JSON and MessagePack. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python3-oslo.serialization-5.0.0-1.4.noarch.rpm"
RPM_HASH = "d1d693361f8ba32f5df7fa005eae8efc3b7e0a4ba757801b4ac9afa1dc48fc04cd0095af3ffe5ca7e57c4b00b2665a1dde06c32c8c8b5bb4c2185246c94227de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.serialization \
python3.11dist-oslo.serialization \
python3dist-oslo.serialization"

RDEPENDS:${PN} += "python-abi \
python3-msgpack \
python3-oslo.utils \
python3-pytz"

inherit rpm

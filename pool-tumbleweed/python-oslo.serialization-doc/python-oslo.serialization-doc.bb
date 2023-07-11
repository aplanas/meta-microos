SUMMARY = "Documentation for OpenStack serialization library"
DESCRIPTION = "The oslo.serialization library provides support for representing objects \
in transmittable and storable formats, such as Base64, JSON and MessagePack. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python-oslo.serialization-doc-5.0.0-1.4.noarch.rpm"
RPM_HASH = "5f317eb9e6d963ef17f5267572c8ecaf40369b44618c35b29f6cb6b78560cbb030d21d4d17ff94fa1d755af143f4a01ab7079d0c027049ae25f1bc038ad7f912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.serialization-doc"

RDEPENDS:${PN} += ""

inherit rpm
